package WEEK3.homework;
import java.util.Scanner;
public class HW_3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String[] str = new String[]{"가위", "바위", "보"};

        while(true) {
            System.out.print("가위 바위 보!>>");
            String input = sc.nextLine();
            if (input.equals("그만")) {
                sc.close();
                return;
            }

            int r = (int)(Math.random() * 3.0);
            String strCom = str[r];
            System.out.print("사용자 = " + input + " , 컴퓨터 = " + strCom + ", ");
            if (input.equals("가위")) {
                if (strCom.equals("가위")) {
                    System.out.println("비겼습니다.");
                } else if (strCom.equals("바위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (strCom.equals("보")) {
                    System.out.println("사용자가 이겼습니다.");
                }
            } else if (input.equals("바위")) {
                if (strCom.equals("가위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if (strCom.equals("바위")) {
                    System.out.println("비겼습니다.");
                } else if (strCom.equals("보")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
            } else if (input.equals("보")) {
                if (strCom.equals("가위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (strCom.equals("바위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if (strCom.equals("보")) {
                    System.out.println("비겼습니다.");
                }
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }
}
