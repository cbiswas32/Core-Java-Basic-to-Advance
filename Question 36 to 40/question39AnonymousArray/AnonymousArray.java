package question39AnonymousArray;

public class AnonymousArray {
    public static void main(String[] args)
    {
        AnonymousArray.sum(new int[]{2,3,4}); //Anonymous Array
        AnonymousArray.print2D(new int[][]{{1,2,3},{4,5,6}});
    }
    static void sum(int[] no)
    {
        int plus=0;
        for(int i:no)
        {
           plus=plus+i;
        }
        System.out.println(plus); 

    }

    static void print2D(int[][] twod)
    {
        int temp=0;
        for(int i=0;i<twod.length;i++)
        {
            for(int j=0;j<twod[i].length;j++)
            {
                temp=temp+twod[i][j];
            }
          
        }
        System.out.println(temp);

        int total=0;
        for(int ii[]:twod)
        {
            for(int i:ii)
            {
                total=total+i;
            }
        }
        System.out.println(total);


    }
    
}
