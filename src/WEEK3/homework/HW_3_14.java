package WEEK3.homework;
import java.util.Scanner;
public class HW_3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] course = new String[]{"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = new int[]{95, 88, 76, 62, 55};

        while(true) {
            System.out.print("과목 이름>>");
            String name = sc.next();

            if (name.equals("그만")) {
                sc.close();
                return;
            }
            int i;

            for(i = 0; i < course.length; ++i) {
                if (course[i].equals(name)) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
            }

            if (i == course.length) {
                System.out.println("없는 과목입니다.");
            }
        }
    }
}
