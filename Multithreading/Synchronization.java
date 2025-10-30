class Display
{
    public synchronized void wish(String name)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Mermaid Princess");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}
            System.out.println(name);
        }
    }
}
class Synchronization extends Thread
{
    Display d;
    String name;
    Synchronization(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
class Sync 
{
    public static void main(String args[])
    {
        Display d=new Display();
        Synchronization s=new Synchronization(d,"Shirahoshi");
        Synchronization s1=new Synchronization(d, "Poseidon");
        s.start();
        s1.start();
    }
}
