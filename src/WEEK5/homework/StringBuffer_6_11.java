package WEEK5.homework;

import java.util.*;

public class StringBuffer_6_11 {
    private String input;
    StringBuffer sb;

    public void Run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 문장 입력 ===");
        System.out.print(">> ");
        input = sc.nextLine();

        sb = new StringBuffer(input);

        while(true) {
            System.out.print("명령 : ");
            String cmd = sc.nextLine();

            if(cmd.equals("그만")) {
                System.out.println("명령을 종료합니다.");
                askRestart();
            }

            String [] tokens = cmd.split("!");
            if(tokens.length != 2) {
                System.out.println("잘못된 명령입니다!");
            } else {
                if(tokens[0].length() == 0 || tokens[1].length() == 0) {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }

                int index = sb.indexOf(tokens[0]);
                if(index == -1) {
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sb.replace(index, index+tokens[0].length(), tokens[1]);
                System.out.println(sb.toString());
            }

        }
    }

    public void askRestart() {
        Scanner sc = new Scanner(System.in);

        System.out.print("새 문장을 입력하시겠습니까?(y/n > ");

        String re = sc.next();

        switch(re) {
            case "y" : case "Y" : case "ㅛ" :
                Run(); break;

            default :
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
        }
    }


    public static void main(String[] args) {

        StringBuffer_6_11 WordChange = new StringBuffer_6_11();
        WordChange.Run();
    }
}
