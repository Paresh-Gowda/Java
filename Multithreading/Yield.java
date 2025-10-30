class Yeild extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
class YD
{
    public static void main(String args[])
    {
        Yeild y=new Yeild();
        y.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}