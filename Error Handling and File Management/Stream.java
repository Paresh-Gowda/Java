import java.io.*;
class Stream implements Serializable
{
    int a=10;
    transient int b=20;  //transient keyword is used
    transient static int c=30;  //transient v/s static reference
    transient final int d=40;  //transient v/s final reference
}
class Serialization
{
    public static void main(String args[]) throws Exception
    {
        Stream s=new Stream();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        //Deserializaton is done below
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Stream s1=(Stream)ois.readObject();
        System.out.println(s1.a+" "+s1.b+" "+Stream.c+" "+s1.d);
        oos.close();
        ois.close();
    }
}