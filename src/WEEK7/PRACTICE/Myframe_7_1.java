package WEEK7.PRACTICE;

import javax.swing.*;

public class Myframe_7_1 extends JFrame{

    public Myframe_7_1() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 300x300
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Myframe_7_1 frame = new Myframe_7_1();
    }

}
