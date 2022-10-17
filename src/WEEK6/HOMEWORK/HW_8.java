package WEEK6.HOMEWORK;
import java.util.*;
public class HW_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = sc.next();

            if(name.equals("그만"))
                break;

            int score = sc.nextInt();

            if(map.containsKey(name)) {
                score += map.get(name);
                map.put(name, score);
            }
            else map.put(name, score);

            Set<String> key = map.keySet();
            Iterator<String> it = key.iterator();

            while(it.hasNext()){
                String na = it.next();
                System.out.printf("(" + na + "," + map.get(na) + ")");
            }
            System.out.println();
        }
    }

}
