import java.io.*;
class Reader {
    public static void main(String args[]) throws IOException
    {
        FileReader fr=new FileReader("write.txt");
        int i=fr.read();
        while ((i!=-1))
        {
            System.out.println((char)i);
            i=fr.read(); 
        }
        fr.close();
    }
}