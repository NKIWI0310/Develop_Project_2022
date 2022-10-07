package WEEK5.homework;
import java.util.Calendar;

public class Calender_6_5 {

    public static void main(String[] args) {

        Calendar cd = Calendar.getInstance();

        int hour = cd.get(Calendar.HOUR_OF_DAY);
        int min = cd.get(Calendar.MINUTE);

        System.out.println("현재시간은 "+hour+"시 "+min+"분 입니다.");
        if(hour>3&&hour<13) System.out.println("Good Morning");
        else if (hour<19) System.out.println("Good Afternoon");
        else if (hour<22) System.out.println("Good Evening");
        else System.out.println("Good night");
    }

}
