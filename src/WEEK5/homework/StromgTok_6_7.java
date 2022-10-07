package WEEK5.homework;

import java.util.*;

public class StromgTok_6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = sc.nextLine();

            if(input.equals("그만")) break;

            StringTokenizer st = new StringTokenizer(input, " ");
            System.out.println("어절 개수는 "+st.countTokens());

////////////////7-2 정답
//            String[] sentence = input.split(" ");
//            System.out.println("어절 개수는 "+sentence.length);

        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }




}
