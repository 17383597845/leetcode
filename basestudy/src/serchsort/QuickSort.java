package serchsort;

public class QuickSort {
    public static void quicksort(int[] a, int L, int R) {
            
    }

    public static void parkition(int[] a, int L, int R, int num){
        int s=0,b=0;
        for(int i=L;i<R-b;i++)
        {
            if(a[i]>num)
            {
                swap(a,i,R-b);
                b++;
                i--;
            }else if(a[i]<num)
            {
                swap(a,i,L+s);
                s++;
            }
        }
    }
    public static void swap(int[]a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
