package WEEK3;
import java.util.Scanner;

public class W_3_2 {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        for(int n = scanner.nextInt(); n != -1; n = scanner.nextInt()) {
            sum += n;
            ++count;
        }

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.print("정수의 개수는 " + count + "개이며 ");
            System.out.println("평균은 " + (double)sum / (double)count + "입니다.");
        }

        scanner.close();
    }
}
