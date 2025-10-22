class Overloading {
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        Overloading o=new Overloading();
        System.out.println(o.add(16,11));
        System.out.println(o.add(5,7,10));
    }
}