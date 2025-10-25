class Zero_Division_Exception {
    public static void main(String args[])
    {
        try
        {
            int a=5/0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero is not possible!");
        }
        finally
        {
            System.out.println("This is impoprtant to print");
        }
    }
}