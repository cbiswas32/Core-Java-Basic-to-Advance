package question37Array2D;

public class Array2D {
    public static void main(String[] args)
    {
        /* There are two types of 2D Array
            1. MATRIX Array
                have same number of column in each row
            2. JAGGED Array
                have different no of column
        */

        //2D array Declaration

        int[][] a;
        /*

        int[] []a;
        int [][]a;
        int[] a[];
        int a[][];

        */

        //2D array Creation
        a=new int[2][2];


        //2D array Initialization
        a[0][0]=20;
        a[0][1]=30;
        a[1][0]=40;
        a[1][1]=50;

         //declaration and creation and initialization in Same Line

        int[][] b={{1,2,3,4,5},{80,90},{50,70,60}};//jagged array

       /*
        int[][] b= new int[3][];
        a[0]=new int[5];
        a[1]=new int[3];
        a[2]=new int[2];

        */

        int[][] c={{1,2,3},{4,5,6},{2,1,12}};//Matrix array



        // Retrive 2D array
        System.out.println("2D array A");
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("2D array B (jagged array)");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("2D array C (matrix array)");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }



        int[][] arr=new int[][]{{15,16,18,19},{14,11,12},{45,65,48}};
        System.out.println(arr[0].length);
    }
    
}
