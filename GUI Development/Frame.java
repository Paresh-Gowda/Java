import javax.swing.*;
class Frame {
    public static void main(String args[])
    {
        JFrame frame=new JFrame();
        JWindow window=new JWindow();
        frame.setSize(200,200);
        window.setSize(50,50);
        frame.setVisible(true);
        window.setVisible(true);
        frame.setTitle("JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}   
