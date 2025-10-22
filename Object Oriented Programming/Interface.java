interface Animal
{
    public void animalSound();
    public void sleep();
}
class Pig implements Animal
{
    public void animalSound()
    {
        System.out.println("wee wee");
    }
    public void sleep()
    {
        System.out.println("zzz");
    }
    public static void main(String args[])
    {
        Pig p=new Pig();
        p.animalSound();
        p.sleep();
    }
}