import java.io.*;
class Directory {
    public static void main(String args[])
    {
        File f=new File("ABC","abc.txt");
        System.out.println(f.exists());
        f.mkdirs();
        System.out.println(f.exists());
    }
}
