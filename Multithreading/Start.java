class Start extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("Start Overriden");
    }
    public void run()
    {
        System.out.println("Thread Created");
    }
}
class Multi
{
    public static void main(String args[])
    {
        Start s=new Start();
        s.start();
    }
}