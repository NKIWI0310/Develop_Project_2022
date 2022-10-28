package WEEK7.HOMEWORK;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HOMEWORK_7_4 extends JFrame{

    HOMEWORK_7_4() {
        setTitle("Ten Color Buttons Frame");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new GridLayout(1,10));

        for(int i=0; i<10; i++) {
            Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                    Color.CYAN, Color.BLUE, Color.MAGENTA,
                    Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
            String text=Integer.toString(i);
            JButton b=new JButton(text);
            b.setOpaque(true);
            b.setBackground(col[i]);
            c.add(b);
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        new HOMEWORK_7_4();
    }
}
