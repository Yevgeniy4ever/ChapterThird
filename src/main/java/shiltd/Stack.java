package shiltd;

/**
 * Created by Developer on 4/13/2017.
 */
public class Stack {

    private int len;
    private String ar[];
    int curPos  = 0;

    public Stack(int len){
        this.len = len;
        String ar[] = new String[len];
    }

    public void pop(){

        System.out.println(ar[curPos]);
        ar[curPos]=null;
        curPos--;
    }

    public void push(String str){
//        if(curPos < ar.length ) {
            ar[curPos] = new String(str);
            curPos++;
            System.out.println("add: " + ar[curPos]);
//        }
//        else
//        {
//            System.out.println("Outbound");
//        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        stack.pop();
        stack.pop();
        stack.pop();
    }
}
