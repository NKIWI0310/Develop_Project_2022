package WEEK6.HOMEWORK;
import java.util.*;
abstract class Shape {
    public Shape() {}
    abstract public void draw();
}
class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor {
    private String name;
    private Scanner sc;
    Vector<Shape> v;

    public GraphicEditor(String name) {
        this.name = name;
        v = new Vector<>();
        sc = new Scanner(System.in);
    }

    void run() {
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int input = sc.nextInt();
            switch(input) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>> ");
                    int insNum = sc.nextInt();
                    insert(insNum);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>> ");
                    int delNum = sc.nextInt();
                    delete(delNum);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.print(name + "을 종료합니다.");
                    sc.close();
                    return;
                default :
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }

    public void insert(int insNum) {
        Shape shape;
        switch(insNum) {
            case 1 :
                shape = new Line();
                break;
            case 2 :
                shape = new Rect();
                break;
            case 3 :
                shape = new Circle();
                break;
            default :
                System.out.println("잘못 입력했습니다.");
                return;
        }
        v.add(shape);
    }

    public void delete(int delNum) {
        if(delNum - 1 >= v.size() || delNum <= 0) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        v.remove(delNum - 1);
    }

    public void print() {
        for(int i = 0; i < v.size(); i++) {
            v.get(i).draw();
        }
    }
}

public class HW_10 {
    public static void main(String[] args) {
        GraphicEditor app = new GraphicEditor("beauty");
        app.run();
    }
}
