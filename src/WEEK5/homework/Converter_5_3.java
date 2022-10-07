package WEEK5.homework;

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요 >> ");
        double val = sc.nextDouble();
        double res = convert(val);

        System.out.println("변환결과 : "+res+getDestString()+" 입니다");

        sc.close();

    }
}

public class Converter_5_3 extends Converter {

    public Converter_5_3(double ratio) {
        this.ratio=ratio;
    }

    protected String getSrcString() {
        return "원";
    }

    protected String getDestString() {
        return "달러";
    }

    protected double convert(double src) {
        double a = src/ratio;
        double b = Math.round(a*100)/100.0;

        return b;
    }

    private static int rateCheck() {    // 환율을 입력받는 스태틱 메소드
        System.out.print("환율 입력 >> ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int input = rateCheck();

        Converter_5_3 toDollar = new Converter_5_3(input);
        toDollar.run();
    }
}
