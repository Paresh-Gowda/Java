import java.util.*;
class Array {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter student marks details:");
        System.out.println("Enter total no. of subjects:");
        int size=in.nextInt();
        in.nextLine();
        String sub_name[]=new String[size];
        System.out.println("Enter the subject name:");
        for(int i=0;i<size;i++)
        {
            sub_name[i]=in.nextLine();
        }
        int[] marks=new int[size]; 
        System.out.println("Enter the marks:");
        for(int i=0;i<size;i++)
        {
            marks[i]=in.nextInt();
        }
        System.out.println("Student Marks Details:");
        for(int i=0;i<size;i++)
        {
            System.out.println(sub_name[i]+"="+marks[i]);
        }
        in.close();
    }
}
