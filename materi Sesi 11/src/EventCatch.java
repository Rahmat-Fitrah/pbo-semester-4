
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventCatch {
    public static void main(String[] args) {
        JFrame f = new JFrame("Belajar Event");
        f.setSize(150, 150);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JTextField t1 = new JTextField("Isikan Angka");
        JButton b1 = new JButton("0");
        JButton b2 = new JButton("1");
        JButton b3 = new JButton("2");
        JButton b4 = new JButton("3");

        p1.add(t1, BorderLayout.NORTH);
        p2.setLayout(new GridLayout(2, 2, 5, 5));
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.add(p1);
        f.add(p2);
    }
}
