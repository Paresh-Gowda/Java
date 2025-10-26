class Throwable {
    public static void main(String args[])
    {
        try
        {
            System.out.println(16/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught Exception:"+e.getMessage());
            throw new ArithmeticException("Division by Zero-manually thrown");
        }
    }
}