class Method extends Thread{}
class Main_Thread
{
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
        Method m=new Method();
        System.out.println(m.getName());
        Thread.currentThread().setName("New");
        System.out.println(Thread.currentThread().getName());
    }
}