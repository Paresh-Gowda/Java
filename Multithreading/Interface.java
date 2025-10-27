class Runnable_Interface implements Runnable
{
    public void run()
    {
        for(int i=0;i<11;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
class Multi_threading
{
    public static void main(String args[])
    {
        Runnable_Interface r=new Runnable_Interface();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<16;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
// Runnable is mostly used because of Multiple implementations, Less memory & High performance