class Catch {
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero is not possible!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of range!");
        }
    }
}