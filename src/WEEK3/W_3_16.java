package WEEK3;
import java.util.Scanner;
public class W_3_16 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 0;

        try {
            for(int i = 0; i < 5; ++i) {
                intArray[i + 1] = i + 1 + intArray[i];
                System.out.println("intArray[" + i + "]=" + intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException var3) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }

    }
}
