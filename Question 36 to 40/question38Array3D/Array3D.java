package question38Array3D;

public class Array3D {
    public static void main(String[] args)
    {
        //3D array Declaration

        int[][][] a;

        //3D array Creation

        a=new int[2][3][2];

        //3D array Declaratin Creation and Initialization in same line

        int[][][] b={{{10,20,30},{10,50},{11,12,14,16}}};

        System.out.println(a.length);
        System.out.println(a[1].length);
        System.out.println(a[1][2].length);
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(b[0][2].length);
        
        System.out.println();
        System.out.println("3D Array B is");


        //3D array Retrive
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                for(int k=0;k<b[i][j].length;k++)
                {
                    System.out.print(b[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            
            
           
        }

        




    }
    
}