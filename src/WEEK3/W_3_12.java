package WEEK3;
import java.util.Scanner;
public class W_3_12 {
    static int[] makeArray() {
        int[] temp = new int[4];

        for(int i = 0; i < temp.length; temp[i] = i++) {
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] intArray = makeArray();

        for(int i = 0; i < intArray.length; ++i) {
            System.out.print(intArray[i] + " ");
        }

    }
}
