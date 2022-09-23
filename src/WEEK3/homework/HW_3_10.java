package WEEK3.homework;
import java.util.Scanner;
public class HW_3_10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int count = 0;

        int i;
        int j;
        do {
            i = (int)(Math.random() * 4.0);
            j = (int)(Math.random() * 4.0);
            arr[i][j] = (int)(Math.random() * 10.0 + 1.0);
            ++count;
        } while(count <= 10);

        for(i = 0; i < arr.length; ++i) {
            for(j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
