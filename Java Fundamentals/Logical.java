class Logical {
    public static void main(String args[]) 
    {
       int a=10,b=20,c=30;
       System.out.println("Largest is a:"+(a>b && a>c));
       System.out.println("Largest is b:"+(b>a && b>c));
       System.out.println("Largest is c:"+(c>b && c>a));
    }
}
