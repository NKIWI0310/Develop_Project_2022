package WEEK3.homework;
import java.util.Scanner;
public class HW_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("정수 몇개?");
            int input = sc.nextInt();
            if (input <= 100 && input > 0) {
                int[] arr = new int[input];

                int i;
                for(i = 0; i < arr.length; ++i) {
                    arr[i] = (int)(Math.random() * 100.0 + 1.0);

                    for(int j = 0; j < i; ++j) {
                        while(arr[i] == arr[j]) {
                            arr[i] = (int)(Math.random() * 100.0 + 1.0);
                            j = 0;
                        }
                    }
                }

                for(i = 0; i < arr.length; ++i) {
                    System.out.print(arr[i] + " ");
                }

                sc.close();
                return;
            }

            System.out.println("범위를 벗어난 숫자입니다. 다시 입력해주세요");
        }
    }
}
