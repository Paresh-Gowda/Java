import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class GUI {
    public static void main(String args[])
    {
        JFrame f=new JFrame("Student Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(250,250);
        JLabel l1=new JLabel("Student name");
        JTextField t1=new JTextField(25);
        JLabel l2=new JLabel("USN");
        JTextField t2=new JTextField(15);
        JButton b=new JButton("Submit");
        ActionListener a=new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b.setText("Submitted");
            } 
        };
        b.addActionListener(a);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
    }
} 