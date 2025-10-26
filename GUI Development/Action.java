import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Action_Listner {
    public static void main(String args[])
    {
        JFrame f=new JFrame("Event Handling");
        JButton b=new JButton("Click Me");
        JLabel l=new JLabel();
        ActionListener a=new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Button Clicked");
            }
        };
        b.addActionListener(a);
        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(l);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}