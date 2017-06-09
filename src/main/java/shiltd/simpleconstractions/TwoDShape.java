package shiltd.simpleconstractions;

/**
 * Created by Developer on 4/17/2017.
 */
public class TwoDShape {
    private double width;
    private double height;


    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    public TwoDShape() {

    }


    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim() {
        System.out.println("Weidth and height is: " +
                            width + " & " + height);
    }
}

class Triangle extends TwoDShape{

    private String style;

    Triangle(String s, double w, double h) {
        super();
//        super(w, h);
        this.setWidth(w);
        this.setHeight(h);
        style = s;
    }

    double are() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle " + style);
    }
}

class Shapes4{

    public static void main(String[] args) {

        Triangle t1 = new Triangle("Colored", 4.0, 4.0);
        Triangle t2 = new Triangle("Contured", 8, 12);

        System.out.println("Information about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Square is: " + t1.are());
        System.out.println();

        System.out.println("Information about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Square is: " + t2.are());
    }
}


