package WEEK8.PRACTICE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx_8_5 extends JFrame{
    private JLabel la = new JLabel("Hello");
    public MouseAdapterEx_8_5() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseAdapter());
        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);
        setSize(250, 250);
        setVisible(true);
    }
    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }
    public static void main(String [] args) {
        new MouseAdapterEx_8_5();
    }
}