package WEEK5.homework;

import java.util.Scanner;

abstract class Calc {     // 추상 클래스
    protected int a;
    protected int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();  // 오버라이딩 해야할 추상 메소드
}

class Add extends Calc{
    public int calculate() {
        return a+b;
    }
}

class Sub extends Calc {
    @Override
    public int calculate() {
        return a-b;
    }
}

class Mul extends Calc{
    @Override
    public int calculate() {
        return a*b;
    }
}

class Div extends Calc{
    @Override
    public int calculate() {
        return a/b;
    }
}
public class calculate_5_11 {
    int a, b;
    String Operator;

    public void Run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        a = sc.nextInt();
        b = sc.nextInt();
        Operator = sc.next();

        switch(Operator) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(a+" + "+b+" = "+add.calculate());
                break;

            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(a+" - "+b+" = "+sub.calculate());
                break;

            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(a+" * "+b+" = "+mul.calculate());
                break;

            case "/":
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(a+" / "+b+" = "+div.calculate());
                break;

            default:
                System.out.println("잘못된 접근입니다.");
        }

        sc.close();
    }

    public static void main(String[] args) {

        calculate_5_11 cal = new calculate_5_11();

        cal.Run();
    }
}
