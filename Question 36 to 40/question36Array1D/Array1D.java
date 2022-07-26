package question36Array1D;

public class Array1D {
    public static void main(String[] args)
    {
        //1. Declaration
        
        int[] a;
        // int[]b;
        // int c[];
        // int []d;


        //2. Creation

        a=new int[3]; // While creation We have to provide the size if the array

        
        
        // Declaration and Creation in One line

        int[] b= new int[4];

        //3. Initialization

        //First method of initialization
        b[0]=101;
        b[1]=105;
        b[2]=107;
        b[3]=200;


        //Second method of initialization
        //Declarion Creation and Initialization in same Line
        int[] c={40,50,60};

        //Third method of initialization
        //Declarion Creation and Initialization in same Line

        int[] d=new int[]{2,3,4,80,70,40};


        //4. Retrive

        // Rtrive using for loop
        // for a Array
        System.out.println("a Array is");
        for(int i=0;i<a.length;i++)
        {
           
            System.out.print(a[i]+" ");

            // The out put will be 0 0 0 (default initialized value) Because we havenot initialized the Array a

            
        }

        //for b Array
        System.out.println( );
        System.out.println("b Array is");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }



        // Rtrive using for-each loop

        //c Array
        System.out.println( );
        System.out.println("c Array is");
        
        
        for(int i: c)
        {
            System.out.print(i+" ");  //for - each loop

        }



        //d Array
        System.out.println( );
        System.out.println("d Array is");

        for(int i:d)
        {
            System.out.print(i+" ");
        }


        




    
    }
    
}
