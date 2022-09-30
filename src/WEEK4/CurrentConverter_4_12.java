package WEEK4;

import java.util.Scanner;

public class CurrentConverter_4_12 {
    private static double rate;
    public static double toDollar(double won) {
        return won/rate;
    }
    public static double toKWR(double dollar) {
        return dollar * rate;
    }
    public static void setRate(double r) {
        rate = r;
    }
}

class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        CurrentConverter_4_12.setRate(rate); // 미국 달러 환율 설정
        System.out.println("백만원은 $" + CurrentConverter_4_12.toDollar(1000000) +"입니다.");
        System.out.println("$100는 " + CurrentConverter_4_12.toKWR(100) + "원입니다.");

        scanner.close();
    }

}
