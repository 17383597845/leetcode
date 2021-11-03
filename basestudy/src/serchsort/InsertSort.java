package serchsort;

public class InsertSort {
    /*public static void main(String[] args) {
        int []a={0,4,6,2,3,1,5,3,6,2,6,21,6,23,6,32,16,5,24,6,86,8};
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j]<a[j-1])
                {
                    swap(a,j,j-1);
                }
            }
        }
        for(int m:a){
            System.out.println(m);
        }
    }*/
    public static void main(String[] args){
        int []a={0,4,6,2,3,1,5,3,6,2,6,21,6,23,6,32,16,5,24,6,86,8};
        for(int i=1;i<a.length;i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1])
                    swap(a, j, j - 1);
            }
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
