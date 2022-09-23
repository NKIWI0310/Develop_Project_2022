package WEEK3;
import java.util.Scanner;
public class W_3_18 {
    public static void main(String[] args) {
        String[] stringNumber = new String[]{"23", "12", "3.141592", "998"};
        int i = 0;

        try {
            for(i = 0; i < stringNumber.length; ++i) {
                int j = Integer.parseInt(stringNumber[i]);
                System.out.println("숫자로 변환된 값은 " + j);
            }
        } catch (NumberFormatException var4) {
            System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
        }

    }
}
