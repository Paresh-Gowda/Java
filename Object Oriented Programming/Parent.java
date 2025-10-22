class Parent
{
    String name="Dragon";
    void printname()
    {
        System.out.println(name);
    }
}
class Child extends Parent
{
    String name="Luffy";
    void displayname()
    {
        System.out.println(super.name);
        System.out.println(this.name);
    }
    public static void main(String args[])
    {
        Child c=new Child();
        c.displayname();
    }
}
//this & super keywords are used in this program