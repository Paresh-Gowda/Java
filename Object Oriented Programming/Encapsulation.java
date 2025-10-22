class Person
{
    private String name="Luffy";
    public String getName()
    {
        return name;
    }
    public String setName()
    {
        this.name="Zoro";
        return this.name;
    }
    public static void main(String args[])
    {
        Person p=new Person();
        System.out.println(p.getName());
        System.out.println(p.setName());
    }
}