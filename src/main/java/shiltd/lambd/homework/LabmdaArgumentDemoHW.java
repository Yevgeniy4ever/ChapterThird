package shiltd.lambd.homework;

/**
 * Created by Developer on 5/31/2017.
 */
public class LabmdaArgumentDemoHW {

    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Labmd function extends Java";
        String outStr;

        System.out.println("Input string is " + inStr);

/*        StringFunc reverse = (str) -> {
            String result = "";
                for (int i = str.length()-1; i >=0; i--)
                    result += str.charAt(i);
            return result;
        };*/

/*
        outStr = changeStr(reverse, inStr);
        System.out.println("Inverted string is" + outStr);
*/

/*
        String inSigns = changeStr((str) -> str.replace(' ', ' '), inStr);

        System.out.println("String with changed spaces");

*/

        outStr = changeStr((str) -> {
            String result = "";
            char ch;
            for (int i = 0; i < str.length(); i ++){
                ch = str.charAt(i);
                if(ch != ' ')
                    result += ch;
        }
        return result;
        }, inStr);

        System.out.println(outStr);




    }



}

interface StringFunc{
    String func(String str);
}



