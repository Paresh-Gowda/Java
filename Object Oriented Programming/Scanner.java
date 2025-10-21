import java.util.*;
class Student_Details {
    public static void main(String args[]) 
    {
        Scanner in=null;
        in=new Scanner(System.in);
        System.out.println("Enter the details of the student:");
        System.out.println("Name:");
        String name=in.nextLine();
        System.out.println("USN:");
        String usn=in.nextLine();
        System.out.println("Branch:");
        String branch=in.nextLine();
        System.out.println("Marks:");
        float marks=in.nextInt();
        System.out.println("\nStudent Details:");
        System.out.println("Name:"+name+"\nUSN:"+usn+"\nBranch:"+branch+"\nMarks:"+marks);
        in.close();
    }
}