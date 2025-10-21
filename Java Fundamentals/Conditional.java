class Conditional {
    public static void main(String args[]) 
    {
        int age=10;
        if(age>=60)
        {
            System.out.println("Senior Citizen");
        }
        else if(age>=18 && age<60)
        {
            System.out.println("Major");
        }
        else
        {
            System.out.println("Minor");
        }
    }
}
