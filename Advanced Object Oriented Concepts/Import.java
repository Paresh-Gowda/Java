import java.util.*;
class Import {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name & age:");
        String name=in.nextLine();
        int age=in.nextInt();
        System.out.println("Name="+name+"\nAge"+age);
        in.close();
    }
} 