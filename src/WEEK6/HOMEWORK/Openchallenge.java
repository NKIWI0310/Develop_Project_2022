package WEEK6.HOMEWORK;
import java.util.Scanner;
import java.util.Vector;

class Word {
    private String engWord;
    private String korWord;

    public Word(String engWord, String korWord) {
        this.engWord = engWord;
        this.korWord = korWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public String getKorWord() {
        return korWord;
    }
}

class WordQuiz {
    private String name;
    private Scanner sc;
    private Vector<Word> v;
    final int MAX = 4;
    int[] question;

    public WordQuiz() {
        name = "명품영어";
        question = new int[MAX];
        sc = new Scanner(System.in);
        v = new Vector<Word>();
        v.add(new Word("love", "사랑"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("society", "사회"));
        v.add(new Word("human", "인간"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("apple", "사과"));
        v.add(new Word("head", "머리"));
        v.add(new Word("water", "물"));
        v.add(new Word("nose", "코"));
        v.add(new Word("book", "책"));
        v.add(new Word("pencil", "연필"));
        v.add(new Word("store", "상점"));
    }

    public void run() {
        System.out.println("\"" + name + "\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
        while(true) {
            randomQuiz();   // 랜덤한 값을 가진 문제 배열 생성 메소드 호출
            int answerNumber = (int)(Math.random() * question.length);  // 0~3 중 한 값을 정답번호로 저장
            int answerIndex = question[answerNumber];   // 정답번호의 배열에 있는 값이 정답
            System.out.println(v.get(answerIndex).getEngWord() + "?");  // 정답의 영어단어를 호출해 문제로 낸다.
            for(int i = 0; i < question.length; i++) {  // 4개의 보기를 만들기 위한 반복문
                System.out.print("(" + (i + 1) + ")" + v.get(question[i]).getKorWord() + " ");
                // 0~3까지 배열에 값을 넣어 각 인덱스의 보기 출력
            }
            System.out.print(">> ");

            int input = sc.nextInt();
            if(input == -1){
                System.out.println("\"" + name + "\"" + "를 종료합니다...");
                sc.close();
                break;
            }
            else if(input - 1 == answerNumber) // 입력한 값은 1~4이므로
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");
        }
    }

    public void randomQuiz() {  // 4개의 보기에 임의의 벡터 인덱스를 주기 위한 메소드
        for(int i = 0; i < MAX; i++) {  // 보기 0 ~ 3 (실제론 1 ~ 4) 의 인덱스에
            question[i] = (int)(Math.random() * v.size());  // 0 ~ 문제의 개수(벡터의 사이즈) 중 임의의 값 저장
            for(int j = 0; j < i; j++) {    // 중복된 값은 없도록 한다.
                if(question[i] == question[j]) {
                    i--;
                    continue;
                }
            }
        }
    }
}

public class Openchallenge {
    public static void main(String[] args) {
        WordQuiz wordQuiz = new WordQuiz();
        wordQuiz.run();
    }
}
