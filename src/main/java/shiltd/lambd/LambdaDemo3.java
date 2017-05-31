package shiltd.lambd;

/**
 * Created by Developer on 5/30/2017.
 */
public class LambdaDemo3 {
    public static void main(String[] args) {

        StringTest isIn = (str1, str2) -> str1.indexOf(str2) != -1;

        String str = "It is test";

        System.out.println("Testing string is " + str);

        if(!isIn.test(str, "It"))
            System.out.println(" \" It \" is not found ");
        else System.out.println(" \" It \" is found ");

        if(isIn.test(str, "syz"))
            System.out.println(" \" xyz \" is found ");
        else System.out.println(" \" xyz \" is not found ");
    }
}
