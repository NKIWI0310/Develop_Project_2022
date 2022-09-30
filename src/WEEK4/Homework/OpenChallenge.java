package WEEK4.Homework;
import java.util.Scanner;

class Player{
    String name;
    String select_word;

    public Player(String name){
        this.name = name;
    }

    public void getWord(){
        Scanner s2 = new Scanner(System.in);
        System.out.printf("%s>>", this.name);
        this.select_word = s2.nextLine();
    }

    public boolean CheckSuccess(String prev_word){
        if(this.select_word.charAt(0) == prev_word.charAt(prev_word.length()-1))
            return true;
        return false;
    }
}

public class OpenChallenge {
    static void run(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.print("게임에 참가하는 인원은 몇명 입니까? >> ");
        int num = s1.nextInt();
        s1.nextLine();
        Player p[] = new Player[num];

        for(int i = 0 ; i < num ; i++){
            System.out.print("참가자의 이름을 입력하세요 >> ");
            String name = s1.nextLine();
            p[i] = new Player(name);
        }

        String prev_word = "아버지";
        System.out.println("시작하는 단어는 아버지 입니다.");

        int j = -1;
        while(true){
            j++;
            j = j%num;
            p[j].getWord();
            if(!p[j].CheckSuccess(prev_word)){
                System.out.println(p[j].name + "이 졌습니다.");
                break;
            }
            prev_word = p[j].select_word;

        }
    }

    public static void main(String[] args) {
        run();
    }
}
