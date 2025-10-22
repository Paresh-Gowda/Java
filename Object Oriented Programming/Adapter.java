interface I{
    public void m1();
    public void m2();
    public void m3();
    public void m4();
    public void m5();
}
abstract class Adapter implements I{
    //Interface with Empty implementations
    public void m1(){};
    public void m2(){};
    public void m3(){};
    public void m4(){};
    public void m5(){};
}
class A extends Adapter
{
    public void m1()
    {
        System.out.println("This is m1 method");
    }
    public static void main(String args[])
    {
        A a=new A();
        a.m1(); 
    }
}
