package WEEK5.homework;

interface ShapeX {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
class Circle implements ShapeX {  //  14번문제를 위해 public 접근지정자를 붙였다.
    int r;

    public Circle(int r) { this.r = r; }

    public void draw() {
        System.out.println("반지름이 "+r+"인 원입니다.");
    }

    public double getArea() {
        return r*r*PI;
    }
}

public class Shape_5_13 {
    public static void main(String[] args) {

        ShapeX donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 "+ donut.getArea());
    }
}
