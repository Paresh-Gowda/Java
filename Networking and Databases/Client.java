import java.net.*;
import java.io.*;
class Client {
    public static void main(String args[]) throws IOException
    {
        Socket s=new Socket("localhost",499);
        System.out.println("Connected to server");
        PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
        pr.println("Hello World!");
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str=bf.readLine();
        System.out.println("Server: "+str);
        s.close();
    }
}