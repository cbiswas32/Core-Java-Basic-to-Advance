package question42SortBubble;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] a={15,12,48,5};
        int temp;
        for(int i=0;i<a.length;i++) //for round Round=Elements-1 
        {
            int justbreak=0;
            for(int j=0;j<a.length-1-i;j++)//Comparing the adj. elements
            {
                //Swapping Logic
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    justbreak=1;

                }

            }

            if(justbreak==0)
            {
                break;//if swapping dont happen any more
            }
        }

        //printing the array after sorting

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        
    }
    
}
