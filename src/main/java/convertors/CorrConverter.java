package convertors;

import lotus.domino.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by Yevgeniy Ponomarev on 6/16/2017.
 */
public class CorrConverter {
    Session ses;
    Connection conn;

    DbSupplier dbs = null;
    Database idb = null;

    public static void main(String[] args) {
        DominoSession ds = new DominoSession("127.0.0.1:63148", "admin", "12345");
        PostgreSQLConnection psc = new PostgreSQLConnection("jdbc:postgresql:Umka", "postgres", "12345");



        try {
            CorrConverter corCon = new CorrConverter(ds.getSession(), psc.getConnection());
            corCon.convert();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NotesException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


    private class ConnectionData {
    private Session dominoSession;
    private Connection dbConnection;

    ConnectionData(Session ses, Connection conn) {
        dominoSession = ses;
        dbConnection = conn;
    }
}



    CorrConverter(Session ses, Connection conn){
        this.ses = ses;
        this.conn = conn;
    }

    private static HashMap<Thread, CorrConverter.ConnectionData> connections = new HashMap<>();

    public void convert() throws NotesException, SQLException {

        DbSupplier dbs = new DbSupplier(ses);
        Database idb = dbs.getDatabase("StructDB");

        UUID cnt_id, cp_id, cnt_type;
        HashMap<String, UUID> domIDtoRDBUidCache = new HashMap<>();


        PreparedStatement corrRS = null;
        PreparedStatement workRS = null;


        try {

            corrRS = conn.prepareStatement("insert into contacts values (" +
                    "?, ?, ?, ?)");
            workRS = conn.prepareStatement("INSERT INTO cntpersons VALUES (" +
                    "?, ?, ?, ?, ?, ?)");

            View main = idb.getView("(CorrByABC)"); //Создаем объект-представление main на основе представления INAllDocuments
            int count = main.getEntryCount();
            System.out.println("Число документов в представлении: " + count);
            View allunid = idb.getView("(AllUnid)"); //Создаем объект-представление AllUNID
            ViewNavigator nav = main.createViewNav(); //На основе main создаем объект навигатор
            ViewEntry ve = nav.getFirstDocument(); //Получаем ссылку на первый документ в навигаторе
            ViewEntry tmpve = null; //Создаем пустую класса вьюэнтри.

            int x = 0;
            int cnt = 0; //Переменная типа инт
            cnt_id = null; // ссылке типа UUID incId ссылаем на нул
            cnt_type = UUID.randomUUID();
            conn.setAutoCommit(false); //Отключаем автокомит в соединении (соединение вообще не используется же, если верить коду)
            while (ve != null) { //пока вьюэнтри не равен нулл - выполняем
                Document cdoc = ve.getDocument(); //получаем документ из вьюэнтри, создаем ссылку cdoc на данный документ
                Document pdoc = allunid.getDocumentByKey(cdoc.getParentDocumentUNID(), true); //из представления allunid получаем родительский документ
                if (pdoc == null && cdoc.getItemValueString("Form").equals("Corr")) {  //если родительский документ равен нулл и в cdoc равен вход
                    //Поздравляем, вы нашли род документ!
                    System.out.println("Получен новый корреспондент! ");
                    cnt_id = UUID.randomUUID(); //Для поля incid генерим ай ди
                    corrRS.setObject(1, cnt_id); //начинаем генерить preparedStatement, для первого параметра указываем сгенеренный инкайди
                    corrRS.setString(2, cdoc.getItemValueString("FullName"));
                    corrRS.setString(3, cdoc.getItemValueString("ShortName"));
                    corrRS.setObject(4, cnt_type);//получаем из хэшмэпа входящий
                    System.out.println("Полное название корреспондента: " + cdoc.getItemValueString("FullName")  + " \n Краткое название корреспондента: " + cdoc.getItemValueString("ShortName") );
                    if (corrRS.executeUpdate() > 0){
                        domIDtoRDBUidCache.put(cdoc.getUniversalID(), cnt_id);
                        System.out.println("Корреспондент успешно импортирован в таблицу контактов.");
                    }
                      } else if((cdoc.getItemValueString("Form").equals("Addr")) & ((cnt_id = domIDtoRDBUidCache.get(cdoc.getParentDocumentUNID())) != null)){
                    System.out.println("Найден новый адресат! ");
                    cp_id = UUID.randomUUID();
                    System.out.println("ID key is " + cdoc.getParentDocumentUNID() + " RBD ID is " + cnt_id);
                    System.out.println("UID is " + cp_id);
                    //отследить связь с род доком и вставить его ID
                    workRS.setObject(1, cp_id);
                    workRS.setString(2, cdoc.getItemValueString("FirstName"));
                    workRS.setString(3, cdoc.getItemValueString("LastName"));
                    workRS.setString(4, cdoc.getItemValueString("MidlName"));
                    workRS.setObject(5, cnt_id);
                    workRS.setString(6, cdoc.getItemValueString("E_Mail"));
                    System.out.println("ФИО адресата " + cdoc.getItemValueString("FirstName")  + " | " + cdoc.getItemValueString("LastName")  + " | " + cdoc.getItemValueString("MidlName"));
                    if (workRS.executeUpdate() > 0 & (domIDtoRDBUidCache.get(cdoc.getUniversalID())== null)){
                        domIDtoRDBUidCache.put(cdoc.getUniversalID(), cnt_id);

                        }

                }   else {
                    try {
                        cnt_id = domIDtoRDBUidCache.get(pdoc.getParentDocumentUNID());
                    } catch (NullPointerException nulEx){
                        System.out.println("Ошибка ");
                        cnt_id = null;
                    }

                    System.out.println("Найден новый адресат прикрепленный к адресату! ");
                    cp_id = UUID.randomUUID();
                    System.out.println("ID род.докумета: " + cdoc.getParentDocumentUNID() + ", Ключ род.документа в SQL: " + cnt_id);
                    System.out.println("ID корреспондента: " + cp_id);
                    //отследить связь с род доком и вставить его ID
                    workRS.setObject(1, cp_id);
                    workRS.setString(2, cdoc.getItemValueString("FirstName"));
                    workRS.setString(3, cdoc.getItemValueString("LastName"));
                    workRS.setString(4, cdoc.getItemValueString("MidlName"));
                    workRS.setObject(5, cnt_id);
                    workRS.setString(6, cdoc.getItemValueString("E_Mail"));
                    System.out.println("ФИО адресата (некор): " + cdoc.getItemValueString("FirstName ")  + " | " + cdoc.getItemValueString("LastName")  + " | " + cdoc.getItemValueString("MidlName"));
                    workRS.executeUpdate();
                    conn.commit();
                }
                conn.commit();
                cdoc.recycle();
                tmpve = nav.getNextDocument();
                System.out.print(++cnt + " ");
                ve.recycle();
                ve = tmpve;
            }
            System.out.println("Обработано " + cnt + " документа(-ов) из " + count);
            corrRS.close();
            workRS.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (corrRS != null && !corrRS.isClosed()) {
                corrRS.close();
            }
            if (workRS != null && !workRS.isClosed()) {
                workRS.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }

    }
}
