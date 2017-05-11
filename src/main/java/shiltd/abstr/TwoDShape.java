package shiltd.abstr;

/**
 * Created by Developer on 4/18/2017.
 */
public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    abstract double area();

    public void showDim(){
        System.out.println("Width and height is " + width
                            + " and " + height);
    }

    TwoDShape(){
        width = height = 0;
        name = "none";
    }

    TwoDShape(TwoDShape ob){
        height = ob.height;
        width = ob.width;
        name = ob.name;
    }

    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n){
        height = width = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Triangle extends TwoDShape{
    private String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w, h, "Triangle");

        style = s;
    }

    Triangle(double x){
        super(x, "Triangle");
        style = "blurred";
    }

    Triangle(Triangle ob){
        super(ob);
         style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle has " + style);
    }




}

class Rectangle extends TwoDShape{

    Rectangle(){
        super();
    }

    Rectangle(double w, double h){
        super(w, h, "Rectangle");
    }

    Rectangle(int x){
        super(x, "Rectangle");
    }

    Rectangle(Rectangle ob){
        super(ob);
    }

    boolean isSquare(){
        if (getHeight() == getWidth()) return true;
        return false;
    }

    double area(){
        return getHeight()*getWidth();
    }
}

class AbsShape{
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        for(int i = 0; i < 4; i ++){
            System.out.println("The object " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}