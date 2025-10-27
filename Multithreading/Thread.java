class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
class My_Thread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Elder Thread");
        }
    }
}
class Multi_Thread
{
    public static void main(String args[])
    {
        MyThread t=new MyThread();
        t.start(); 
        My_Thread m=new My_Thread();
        m.start(); 
        for(int i=0;i<10;i++)
        {
            System.out.println("Parent Thread");
        }
    }
}
//We can use t.run(); for linear order output