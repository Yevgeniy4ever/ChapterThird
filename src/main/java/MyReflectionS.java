import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

/**
 * Created by Developer on 6/13/2017.
 */
public class MyReflectionS {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClass a = new MyClass();
        Class aclass = a.getClass();

        System.out.println(aclass);


        Class bclass = MyClass.class;
        Class iclass = Integer.class;

        System.out.println(iclass);

    try {
        Class b = Class.forName("com.mysql.jdbc.Driver");
        System.out.println(b);
    } catch (ClassNotFoundException ex){
        System.out.println("Error " + ex);
    }



        MyClass myObject = new MyClass();
        Class c = myObject.getClass();
        String s = c.getName();

        System.out.println(s);


        MyClass obj = myObject;
        Class d =  obj.getClass();
        int mods = d.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }


        MyClass myObj = new MyClass();
        Class e = myObj.getClass();
        Class superclass = e.getSuperclass();

        System.out.println(superclass);


        Class f =  LinkedList.class;
        Class[] interfaces = f.getInterfaces();
        for(Class cInterface : interfaces) {
            System.out.println( cInterface.getName() );
        }


        Class g = obj.getClass();
        System.out.println("this is my class " + g);
        System.out.println(g.getName());
        System.out.println(g.getClass());

        MyClass y = new MyClass();
        g = y.getClass();

        System.out.println("Show me " + obj);

        Field[] publicFields = g.getFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.println("Имя: " + field.getName());
            System.out.println("Тип: " + fieldType.getName());
        }

        try {
            Field nameField = c.getField("count");
            System.out.println("NameField is " + nameField);
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
        }

        Class h = obj.getClass();

        try {
            Field nameField = h.getField("name");
            System.out.println(nameField);
        } catch (NoSuchFieldException ex){
            System.out.println("Error " + ex);
        }

        MyClass test = new MyClass();
        Class test2 = test.getClass();
        try {
            MyClass test3 = (MyClass) test2.newInstance();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }

        MyClass newEx = new MyClass();
        Class newClass = newEx.getClass();


        System.out.println("Demonstration of declared fields: ");
        Field[] decArr = newClass.getDeclaredFields();

        for(Field field : decArr){
            System.out.println(field);
            System.out.println("field.getName(): " + field.getName());
            System.out.println("field.getModifiers(): " + field.getModifiers());

            if (Modifier.isPublic(field.getModifiers())) {
                System.out.println("public");
            }
            if (Modifier.isAbstract(field.getModifiers())) {
                System.out.println("abstract");
            }
            if (Modifier.isFinal(field.getModifiers())) {
                System.out.println("final");
            }
            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println("private");
            }
            if (Modifier.isStrict(field.getModifiers())) {
                System.out.println("protected");
            }

            System.out.println("field.getType()): " + field.getType());
            System.out.println("And one more  ");
        }

        MyClass itsGreat = new MyClass();

        Class fost = itsGreat.getClass();
        try {
            Field fieldName = fost.getDeclaredField("name");
            try {
                String strName = (String) fieldName.get(itsGreat);
                System.out.println(strName);
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
        }





        Class go = itsGreat.getClass();
        Field field = null;
        try {
            field = go.getDeclaredField("name");
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
        }
        try {
            String nameValue = (String) field.get(obj);
            System.out.println(nameValue);
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }


        MyClass methodTest = new MyClass();
        Class myMethods = methodTest.getClass();
        Method[] methods = myMethods.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println();
        System.out.println();
        System.out.println("Now we will get parameters");

        MyClass myHome = new MyClass();
        Class home = obj.getClass();
        Method[] itIsMethods = home.getMethods();
        int count = 0;
        for (Method method : itIsMethods) {
            System.out.println("It is " + count + " method");
            System.out.println("Имя: " + method.getName());
            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Типы параметров: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println(" \n");
            count++;
        }




        MyClass stTest = new MyClass();
        Class refTest = stTest.getClass();
//        Method[] stMethods = refTest.getMethods();
        Class[] paramTypes = new Class[] {int.class, int.class};
        try {
            Method method = refTest.getMethod("unrealMethod", paramTypes);
            Object[] los = new Object[]{1, 2};
            Integer i = (Integer) method.invoke(stTest, los);
            System.out.println(i);
            System.out.println();

        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
                e1.printStackTrace();
        } catch (InvocationTargetException e1) {
                e1.printStackTrace();
        }

        Class cake = Class.forName("MyClass");
        Object vobj = cake.newInstance();
        MyClass demo = (MyClass) vobj;

        System.out.println(demo);
    }


}
