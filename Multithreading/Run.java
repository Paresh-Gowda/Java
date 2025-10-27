class Run extends Thread 
{
    public void run()
    {
        System.out.println("No argument run method");
    }
    public void run(int i)
    {
        System.out.println("Agument run method");
    }
}
class Multithread
{
    public static void main(String args[])
    {
        Run m=new Run();
        m.start();
        m.run();
        m.run(16);
    }
}