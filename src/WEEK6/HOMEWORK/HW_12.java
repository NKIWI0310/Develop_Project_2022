package WEEK6.HOMEWORK;
import java.util.*;

class Word9 {
    private String engWord9;
    private String korWord9;

    public Word9(String engWord9, String korWord9) {
        this.engWord9 = engWord9;
        this.korWord9 = korWord9;
    }

    public String getEngWord9() {
        return engWord9;
    }

    public String getKorWord9() {
        return korWord9;
    }
}

class Word9Quiz {
    private String name;
    private Scanner sc;
    private Vector<Word9> v;
    final int MAX = 4;
    int[] question;

    public Word9Quiz() {
        name = "명품영어";
        question = new int[MAX];
        sc = new Scanner(System.in);
        v = new Vector<Word9>();
        v.add(new Word9("love", "사랑"));
        v.add(new Word9("painting", "그림"));
        v.add(new Word9("bear", "곰"));
        v.add(new Word9("eye", "눈"));
        v.add(new Word9("society", "사회"));
        v.add(new Word9("human", "인간"));
        v.add(new Word9("picture", "사진"));
        v.add(new Word9("apple", "사과"));
        v.add(new Word9("head", "머리"));
        v.add(new Word9("water", "물"));
        v.add(new Word9("nose", "코"));
        v.add(new Word9("book", "책"));
        v.add(new Word9("pencil", "연필"));
        v.add(new Word9("store", "상점"));
    }

    public void run() {
        System.out.println("**** 영어 단어 테스트 프로그램 \"" + name + "\" 입니다. ****");
        while(true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            int input = sc.nextInt();

            switch(input) {
                case 1:
                    test();
                    break;
                case 2:
                    insertQuiz();
                    break;
                case 3:
                    System.out.print("\"" + name + "\" 를 종료합니다.");
                    sc.close();
                    return;
            }
        }
    }

    public void test() {
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");
        while(true) {
            randomQuiz();
            int answerNumber = (int)(Math.random() * question.length);
            int answerIndex = question[answerNumber];
            System.out.println(v.get(answerIndex).getEngWord9() + "?");
            for(int i = 0; i < question.length; i++) {
                System.out.print("(" + (i + 1) + ")" + v.get(question[i]).getKorWord9() + " ");
            }
            System.out.print(">> ");
            int input = 0;
            try {   // 예외가 발생할 수 있는 숫자 실행문을 try 블록에 넣는다.
                input = sc.nextInt();
            }
            catch(InputMismatchException e) {   // 정수가 아닌 문자열을 입력하면 예외 발생
                System.out.println("숫자를 입력하세요 !!");
                sc.next();  // 현재 입력 스트림에 남아 있는 토큰 지우기
                continue;   // 다음 루프
            }

            if(input == -1){
                System.out.println();
                break;
            }
            else if(input - 1 == answerNumber) // 입력한 값은 1~4이므로
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");
        }
    }

    public void insertQuiz() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true) {
            System.out.print("영어 한글 입력 >> ");
            String engWord9 = sc.next();

            if(engWord9.equals("그만")) {
                System.out.println();
                break;
            }

            String korWord9 = sc.next();

            v.add(new Word9(engWord9, korWord9));
        }
    }

    public void randomQuiz() {
        for(int i = 0; i < MAX; i++) {
            question[i] = (int)(Math.random() * v.size());
            for(int j = 0; j < i; j++) {
                if(question[i] == question[j]) {
                    i--;
                    continue;
                }
            }
        }
    }
}

public class HW_12 {
    public static void main(String[] args) {
        Word9Quiz word9Quiz = new Word9Quiz();
        word9Quiz.run();
    }
}
