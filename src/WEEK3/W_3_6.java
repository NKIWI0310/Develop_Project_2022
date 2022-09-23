package WEEK3;
import java.util.Scanner;
public class W_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("exit을 입력하면 종료합니다.");

        String text;
        do {
            System.out.print(">>");
            text = scanner.nextLine();
        } while(!text.equals("exit"));

        System.out.println("종료합니다...");
        scanner.close();
    }
}
