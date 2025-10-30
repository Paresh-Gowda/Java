import java.util.concurrent.*;
class Print implements Runnable
{
    String name;
    Print(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(name+" Job has been started by "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {}
        System.out.println(name+" Job has been completed "+Thread.currentThread().getName());
    }
}
class Executor
{
    public static void main(String args[])
    {
        Print[] jobs={new Print("A"),new Print("B"),new Print("C"),new Print("D"),new Print("E"),new Print("F")};
        ExecutorService s=Executors.newFixedThreadPool(3);
        for(Print job:jobs)
        {
            s.submit(job);
        }
        s.shutdown();
    }
}
