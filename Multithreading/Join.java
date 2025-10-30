class Join extends Thread
{
    public void run()
    {
        for(int i=0;i<16;i++)
        {
            System.out.println("Second Thread");
            try
            {
                Thread.sleep(1000);  //sleep method is used
            }
            catch(InterruptedException e) {}
        }
    }
}
class JD
{
    public static void main(String args[]) throws InterruptedException
    {
        Join j=new Join();
        j.start();
        j.join(10000);
        for(int i=0;i<11;i++)
        {
            System.out.println("First Thread");
        }
    }    
}
