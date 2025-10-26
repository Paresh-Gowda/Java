import javax.swing.*;
import java.awt.*;
class Panel {
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        JButton b=new JButton("Button");
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBounds(50,100,100,200);
        p.setBackground(Color.cyan);
        b.setBounds(25,50,50,100);
        b.setBackground(Color.green);
        p.add(b);
        f.add(p);
    }
}
