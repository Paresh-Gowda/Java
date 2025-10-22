import java.util.*;
class Array_2D {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        int rows=in.nextInt();
        System.out.println("Enter the size of columns:");
        int columns=in.nextInt();
        System.out.println("Enter the elements of the matrix:");
        int[][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println("The Matrix=");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               System.out.print(matrix[i][j]+" ");;
            }
            System.out.println();
        }
        in.close();
    }
}
