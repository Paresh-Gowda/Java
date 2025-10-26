import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Drawing {
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        JPanel p=new JPanel()
        {
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
            }
        };
        MouseListener ml=new MouseListener() 
        {
            public void mouseClicked(MouseEvent e)
            {
                int x=e.getX();
                int y=e.getY();
                Graphics g=p.getGraphics();
                g.setColor(Color.BLUE);
                g.fillOval(x-5,y-5,10,10);
                g.dispose();
            }
        public void mousePressed(MouseEvent e)
        {}
        public void mouseReleased(MouseEvent e)
        {}
        public void mouseEntered(MouseEvent e)
        {}
        public void mouseExited(MouseEvent e)
        {}
    };
        p.addMouseListener(ml);
        f.add(p);
        f.setVisible(true);
    }
}
