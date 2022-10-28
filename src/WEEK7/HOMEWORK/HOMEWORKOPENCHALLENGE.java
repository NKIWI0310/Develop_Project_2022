package WEEK7.HOMEWORK;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HOMEWORKOPENCHALLENGE extends JFrame {
    HOMEWORKOPENCHALLENGE(){
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel2(),BorderLayout.NORTH);
        c.add(new CenterPanel2(),BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new HOMEWORKOPENCHALLENGE();
    }
}
class NorthPanel2 extends JPanel{
    NorthPanel2(){
        setBackground(Color.LIGHT_GRAY);
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}
class CenterPanel2 extends JPanel{
    CenterPanel2(){
        this.setLayout(null);
        String text[] = {"Hello", "Java", "Love"};
        int x;
        int y;
        JLabel label;
        for(int i=0;i<3;i++) {
            x = (int)(Math.random()*250);
            y = (int)(Math.random()*250);
            label = new JLabel(text[i]);
            label.setLocation(x, y);
            label.setSize(50,10);
            this.add(label);
        }
    }
}