class Static {
    static
    {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }
    public static void main(String args[])
    {
        System.out.println("Main method");
        Static s=new Static();
        System.out.println(s);
    }
}
