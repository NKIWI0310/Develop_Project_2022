package WEEK4;

public class Circle_4_1 {
    int radius;
    String name;

    public Circle_4_1() { }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        WEEK4.Circle_4_1 pizza;
        pizza = new WEEK4.Circle_4_1();
        pizza.radius = 10;
        pizza.name = "javapizza";
        double area = pizza.getArea();

        System.out.println(pizza.name + "의 면적은 " + area);
        WEEK4.Circle_4_1 donut = new WEEK4.Circle_4_1();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
