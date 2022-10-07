package WEEK5.homework;
import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

public class StringStack_5_9 implements Stack{
    String[] arr;
    int length, capacity;

    public StringStack_5_9(int num) {
        arr = new String[num];

        length = 0;
        capacity = num;

    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public String pop() {
        return arr[--length];
    }

    @Override
    public boolean push(String val) {
        if(length == capacity) {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        } else {
            arr[length++]= val;
            return true;
        }
    }

    public boolean isEmpty() {
        if(length==0)
            return true;
        else
            return false;
    }

    public void print() {
        System.out.print("스택에 저장된 모든 문자열 팝 :");
        while (!isEmpty()) {
            System.out.print(" "+pop());
        } System.out.println();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int length = sc.nextInt();

        StringStack_5_9 stk = new StringStack_5_9(length);

        while (true) {
            System.out.print("문자열 입력 >> ");
            String text = sc.next();

            if(text.equals("그만")) break;

            stk.push(text);
        }

        stk.print();
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

}
