package WEEK7.PRACTICE;

import javax.swing.*;
import java.util.jar.JarFile;
import java.awt.*;

public class FlowLayoutEx_7_3 extends JFrame {

    public FlowLayoutEx_7_3() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutEx_7_3();
    }
}
