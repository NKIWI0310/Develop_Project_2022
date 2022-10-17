package WEEK6.HOMEWORK;
import java.util.*;

public class HW_2 {
    public static final int GRADE_NUM = 6;    // 입력받을 개수를 상수로 선언

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> a = new ArrayList<>();

        System.out.print(GRADE_NUM+"개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");

        for(int i=0; i<GRADE_NUM; i++) {
            char Grade = sc.next().charAt(0);
            a.add(Grade);
        }

        int sum=0;
        for(int i=0; i<a.size(); i++) {
            char c = a.get(i);

            switch(c) {
                case 'A' : case 'a' :
                    sum+=4; break;
                case 'B' : case 'b' :
                    sum+=3; break;
                case 'C' : case 'c' :
                    sum+=2; break;
                case 'D' : case 'd' :
                    sum+=1; break;
                default :
            }
        }
        double avg = sum/(double)a.size();
        System.out.println(avg);
        sc.close();
    }

}
