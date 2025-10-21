import java.util.*;
class Method {
    public int Sum(int p,int q)
    {
        return p+q;
    }
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.err.println("Enter the value of a & b:");
        Method m=new Method();
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(m.Sum(a,b));
        in.close();
    }
}
