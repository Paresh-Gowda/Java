import java.util.*;
class Calculator {
    public static void main(String args[]) 
    {
        Scanner in=null;
        in=new Scanner(System.in);
        System.err.println("Enter the value of a & b:");
        int a=in.nextInt();
        int b=in.nextInt();
        System.err.println("Choose 1.Add,2.Sub,3.Mul,4.Div,5.Mod:");
        int res=in.nextInt();
        switch(res)
        {
            case 1 : System.out.println("Addition="+(a+b));
                     break;
            case 2 : System.out.println("Subtraction="+(a-b));
                     break;
            case 3 : System.out.println("Multiplication="+(a*b));
                     break;
            case 4 : System.out.println("Division="+(a/b));
                     break;
            case 5 : System.out.println("Modulo Division="+(a%b));
                     break;
            default : System.out.println("Invalid Choice");
        }
        in.close();
    }
}
