class Obj {
    public static void main(String args[])
    {
        Object o=new String("Hello");
        Class<? > c=o.getClass();
        System.out.println(c.getName());
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
