package question41ArrayTraversing;

public class ArrayTraversing {
    public static void main(String[] args)
    {
        int[] a={10,20,30};
        int[][] b={{10,15,40},{25,15,18}};
        int[][][] c={{{15,18,20},{14,18,40}},{{10,40},{25,15,18,19}}};
        ArrayTraversing.array1D(a);
        ArrayTraversing.array2D(b);
        ArrayTraversing.array3D(c);


    
    }

    static void array1D(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    static void array2D(int[][] b)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void array3D(int[][][] c)
    {
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                for(int k=0;k<c[i][j].length;k++)
                {
                    System.out.print(c[i][j][k]+" "); 
                }
                System.out.println();
            }
            System.out.println();

        }
    }
    
}
