class Assignment {
    public static void main(String args[])
    {
        int p=10;
        System.out.println("Addition="+(p+=5));
        System.out.println("Subtraction="+(p-=2));
        System.out.println("Multiplication="+(p*=3));
        System.out.println("Division="+(p/=2));
        System.out.println("Remainder="+(p%=5));
    }
}
