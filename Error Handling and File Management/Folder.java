import java.io.*;
class Folder {
    public static void main(String args[])
    {
        File f=new File("ABC");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}