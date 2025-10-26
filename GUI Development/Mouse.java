import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class Mouse_Listener {
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        JPanel p=new JPanel();
        f.add(p);
        JLabel l=new JLabel("Mouse events are displayed");
        p.add(l);
        MouseListener ml=new MouseListener()
        {
            public void mouseClicked(MouseEvent e)
            {
                l.setText("Mouse is clicked");
            }
            public void mousePressed(MouseEvent e)
            {
                l.setText("Mouse is pressed");
            }
            public void mouseReleased(MouseEvent e)
            {
                l.setText("Mouse is released");
            }
            public void mouseEntered(MouseEvent e)
            {
                l.setText("Mouse is entered");
            }
            public void mouseExited(MouseEvent e)
            {
                l.setText("Mouse is exited");
            }
        };
        p.addMouseListener(ml);
        f.setVisible(true);
    }
}
