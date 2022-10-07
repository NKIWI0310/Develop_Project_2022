package WEEK5.homework;
import java.util.Scanner;

class Histogram {
    private Scanner sc = new Scanner(System.in);
    private int arrAlpha[];

    int[] countAlpha(String s) {
        arrAlpha = new int[26];
        String str = s.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90)
                arrAlpha[c - 65]++;
        }
        return arrAlpha;
    }

    String readString() {
        StringBuffer sb = new StringBuffer();
        while (true) {
            String line = sc.nextLine();
            if (line.length() == 1 && line.charAt(0) == ';')
                break;
            sb.append(line);
        }
        return sb.toString();
    }

    public void run() {
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        String s = this.readString();
        int arr[] = this.countAlpha(s);
        System.out.println("히스토그램을 그립니다.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) (i + 65));
            for (int j = 0; j < arr[i]; j++)
                System.out.print("-");
            System.out.println();
        }
    }

}

public class openchallenge_6 {
    public static void main(String[] args) {
        Histogram his = new Histogram();
        his.run();
    }
}
