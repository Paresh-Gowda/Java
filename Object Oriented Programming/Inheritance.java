class Inheritance {
    float salary=20000;
}
class Main extends Inheritance
{
    float bonus=2000;
    public static void main(String args[]) 
    {
        Main m=new Main();
        System.out.println(m.bonus);
        System.out.println(m.salary);
    }
}
