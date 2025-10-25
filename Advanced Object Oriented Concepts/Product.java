import java.util.*;
class Matrix_Multiplication {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the rows of matrix1:");
        int rows1=in.nextInt();
        System.out.println("Enter the columns of matrix1:");
        int columns1=in.nextInt();
        System.out.println("Enter the rows of matrix2:");
        int rows2=in.nextInt();
        if(columns1!=rows2)
        {
            System.out.println("Matrix multiplication not possible!! Columns of matrix1 should be equal to rows of matrix2");
            in.close();
            return;
        }
        System.out.println("Enter the columns of matrix2:");
        int columns2=in.nextInt();
        System.out.println("Enter the elements of the matrix1:");
        int[][] a=new int[rows1][columns1];
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<columns1;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix2:");
        int[][] b=new int[rows2][columns2];
        for(int i=0;i<rows2;i++)
        {
            for(int j=0;j<columns2;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        int[][] c=new int[rows1][columns2];
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<columns2;j++)
            {
                for(int k=0;k<columns1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The Product of Matrices=");
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<columns2;j++)
            {
               System.out.print(c[i][j]+" ");;
            }
            System.out.println();
        }
        in.close();
    }
}
