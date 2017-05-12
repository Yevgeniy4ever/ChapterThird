package shiltd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Yevgeniy on 14.04.2017.
 */
class Stack{

    private String[] arr;
    private int curPos = 0;


    public Stack(int len){
        arr = new String[len];
    }

    public void pop(){
        if(curPos > 0 ) {
            System.out.println("Low " + arr[curPos]);
            arr[curPos] = null;
            curPos--;

        }
        if(curPos == 0 && arr[curPos]!= null){
            System.out.println("Low " + arr[curPos]);
            arr[curPos] = null;
            curPos=0;

        }	else	{
            System.out.println("ARRAY IS EMPTY");
        }
    }

    public void push() throws IOException {
        while(true) {

            System.out.println("curPos: " + curPos);
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String myString = read.readLine();
            if (curPos < arr.length) {
                arr[curPos] = myString;
                System.out.println("Hight " + arr[curPos]);
                if(curPos<arr.length-1){
                    curPos++;
                } else {
                    break;
                }
            } else {
                System.out.println("ARRAY IS FULL");
                break;
            }
        }
    }

    public static void main(String args[]){
        Stack stack = new Stack(5);
        try {
            stack.push();
        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("ERROR IN READING STRING");
        }
        stack.pop();
    }

    public int getCurPos() {
        return curPos;
    }

    public String[] getArr() {
        return arr;
    }

    public String getValue(String[] arr, int curPost){
        return arr[curPost];
    }
}