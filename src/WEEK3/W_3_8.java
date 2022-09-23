package WEEK3;
import java.util.Scanner;
public class W_3_8 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(intArray.length + "개의 정수를 입력하세요>>");

        int i;
        for(i = 0; i < intArray.length; ++i) {
            intArray[i] = scanner.nextInt();
        }

        for(i = 0; i < intArray.length; ++i) {
            sum += intArray[i];
        }

        System.out.print("평균은 " + (double)sum / (double)intArray.length);
        scanner.close();
    }
}
