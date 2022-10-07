package WEEK5.homework;
import java.util.Scanner;

class RSP_Player {

    String name;
    Scanner sc = new Scanner(System.in);

    RSP_Player() { name="철수"; }

    RSP_Player(String name) {   // 만약 매개변수에 String타입 을 넣으면 이름을 매개변수로 설정
        this.name=name;
    }

    public String getName() { return name; }

    public int turn() {
        System.out.print(name+"[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
        return sc.nextInt();
    }
}

class RSP_Computer extends RSP_Player {   // Player를 상속받았다.

    public RSP_Computer() { name = "컴퓨터"; }

    public int turn() {  // 오버라이딩
        return (int)(Math.random()*3+1);
    }
}

public class Game_6_9 {
    final String p[] = {"가위","바위","보"};
    RSP_Player[] player = new RSP_Player[2];

    int game, win, lose;

    public Game_6_9() {
        player[0] = new RSP_Player();
        player[1] = new RSP_Computer();
    }

    public void Run() {
        int p_sel, c_sel;

        while (true) {
            p_sel = player[0].turn();
            if(p_sel == 4) break;

            if(p_sel>4 || p_sel<=0) {
                System.out.println("잘못 입력했습니다.");
                continue;
            }

            c_sel = player[1].turn();

            game++;

            System.out.println(player[0].getName()+"("+p[p_sel-1]+")"+" : "+player[1].getName()+"("+p[c_sel-1]+")");

            int result = p_sel - c_sel;

            switch(result) {
                case 1 : case -2 :
                    System.out.println(player[0].getName()+"가 이겼습니다.\n");
                    this.win++;
                    break;
                case -1 : case 2 :
                    System.out.println(player[1].getName()+"가 이겼습니다.\n");
                    this.lose++;
                    break;
                case 0 :
                    System.out.println("비겼습니다.\n"); break;
                default : System.out.println("잘못된 접근입니다.");
            }
        }
        WinRate();
        return;
    }

    public void WinRate() {
        System.out.println("\n\n======결과======");
        System.out.println("가위바위보를 한 횟수 : "+game);
        System.out.println(player[0].getName()+"가 이긴 횟수 : "+win);
        System.out.println(player[0].getName()+"가 진 횟수 : "+lose);
        System.out.println("승률 : "+((double)win/(Math.round(win+lose))*100+"%"));
    }

    public static void main(String[] args) {
        Game_6_9 a = new Game_6_9();
        a.Run();

        System.out.println("프로그램을 종료합니다.");
    }

}
