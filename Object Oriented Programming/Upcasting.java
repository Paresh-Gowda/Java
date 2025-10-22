class P
{
    void print()
    {
        System.out.println("Parent method");
    }
}
class C extends P
{
    void print()
    {
        System.out.println("This is overridden as Child method");
    }
}
class Upcasting
{
    public static void main(String args[])
    {
        P p=new P();
        P p1=new C();
        p.print();
        p1.print();
    }
}