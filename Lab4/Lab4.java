import java.util.Scanner;
abstract class Shape{
    double a;double b;
    Shape(double w,double f){
        a=w;b=f;
    }
    Shape(double r){
        a=r;
    }
    abstract void print_area();
}
class Rectangle extends Shape{
    Rectangle(double l,double w){
        super(l,w);
    }
    void print_area() {
        System.out.println("The area of the Rectangle is :"+a*b);
    }
}
class Triangle extends Shape{
    Triangle(double h,double b){
        super(h,b);
    }
    void print_area() {
        System.out.println("The area of the Triangle is :"+a*b*0.5);
    }
}
class Circle extends Shape{
    Circle(double r){
        super(r);
    }
    void print_area() {
        System.out.println("The area of the Circle is :"+a*a*(22/7));
    }
}
public class Lab4 {
    public static void main(String[] args) {
        double length,width,base,height,radius;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle: ");
        length=s.nextDouble();
        width=s.nextDouble();
        System.out.println("Enter the base and height of the triangle: ");
        base=s.nextDouble();
        height=s.nextDouble();
        System.out.println("Enter the radius of the circle: ");
        radius=s.nextDouble();
        Rectangle r=new Rectangle(length,width);
        Triangle t=new Triangle(height,base);
        Circle d=new Circle(radius);
        r.print_area();
        t.print_area();
        d.print_area();
    }
}
