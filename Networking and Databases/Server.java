import java.net.*;
import java.io.*;
class Server {
    public static void main(String args[]) throws IOException
    {
        ServerSocket ss=new ServerSocket(499);
        Socket s=ss.accept();
        System.out.println("Client connected");
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str=bf.readLine();
        System.out.println("Client: "+str);
        PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
        pr.println("Hi, how can I help you?");
        s.close();
        ss.close();
    }
}
