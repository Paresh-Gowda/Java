class Test {
    Test(double d)
    {
        this(10);
        System.out.println("Double Integer argument");
    }
    Test(int d)
    {
        this();
        System.out.println("Integer argument");
    }
    Test()
    {
        System.out.println("No argument");
    }
    public static void main(String args[])
    {
        Test t=new Test(10.5);
        System.out.println(t);
    }
}
//this constructor is used in this program