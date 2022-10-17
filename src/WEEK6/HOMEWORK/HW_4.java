package WEEK6.HOMEWORK;
import java.util.*;
public class HW_4 {

    public static void main(String[] args) {

        Vector v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true) {

            System.out.print("강수량 입력 (0 입력시 종료) >> ");

            int input = sc.nextInt();
            if(input==0) break;

            v.add(input);
            sum+=input;
            Iterator<Integer> it = v.iterator();

            while(it.hasNext()) {
                int n = it.next();
                System.out.print(n+"  ");
            }


            System.out.println("\n현재 평균 "+sum/v.size());
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

}
