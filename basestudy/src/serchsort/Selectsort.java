package serchsort;

public class Selectsort {
    /*public static void main(String[] args) {
        int []a={0,4,6,2,3,1,5,3,6,2,6,21,6,23,6,32,16,5,24,6,86,8};
        for(int i=0;i<a.length-1;i++)
        {
            int maxIndex=i;
            for (int j = i; j < a.length; j++) {
                if(a[j]<a[maxIndex]){
                    maxIndex=j;
                }
            }
            swap(a,i,maxIndex);
        }
        for(int m:a)
        {
            System.out.println(m);
        }
    }
    public static void swap(int[]a,int i,int j)
    {
        int x=a[i];
        a[i]=a[j];
        a[j]=x;
    }*/
    public static void main(String[] args)
    {
        int []a={0,4,6,2,3,1,5,3,6,2,6,21,6,23,6,32,16,5,24,6,86,8};
        for(int i=0;i<a.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[minindex]>a[j])
                {
                    minindex=j;
                }
            }
            if(minindex!=i)
            swap(a,minindex,i);
        }
        for(int x:a)
        {
            System.out.println(x);
        }
    }
    public static void swap(int[]a,int i,int j)
    {
        a[i]=a[i]^a[j];
        a[j]=a[i]^a[j];
        a[i]=a[i]^a[j];
    }
}
