import java.io.*;
class Writer {
    public static void main(String args[]) throws IOException
    {
        FileWriter fw=new FileWriter("write.txt");
        fw.write(11);
        fw.write("\n");
        char[] c={'P'};
        fw.write(c);
        fw.close();
    }
}