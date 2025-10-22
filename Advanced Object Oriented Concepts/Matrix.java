import java.util.*;
class Matrix_Addition {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        int rows=in.nextInt();
        System.out.println("Enter the size of columns:");
        int columns=in.nextInt();
        System.out.println("Enter the elements of the matrix1:");
        int[][] a=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix2:");
        int[][] b=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        int[][] c=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The Sum of Matrices=");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               System.out.print(c[i][j]+" ");;
            }
            System.out.println();
        }
        in.close();
    }
}
