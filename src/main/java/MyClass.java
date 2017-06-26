import java.util.ArrayList;

/**
 * Created by Developer on 6/13/2017.
 */
public class MyClass extends MySuperClass implements MyInterface{
    public String name = "Name";
    public int count = 0;
    private String location = "Brazil";
    ArrayList<String> list;


    MyClass(){
        list = new ArrayList<>();
        list.add("first");
        list.add("second");
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(list);
    }
    public void ptintMe(){
        System.out.println("Hello guys");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer unrealMethod(int x, int y){
        return x+y;
    }
}
