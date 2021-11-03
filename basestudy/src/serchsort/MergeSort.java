package serchsort;

/*
public class MergeSort {
    public static void main(String[] args) {
        int []a={0,4,6,2,3,1,5,3,6};
        process(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void process(int []a,int L,int R)
    {
        if(L==R)
        {
            return;
        }
        int mid=L+((R-L)>>1);
        process(a,L,mid);
        process(a,mid+1,R);
        merge(a,L,mid,R);
    }
    public static void merge(int[]a,int L,int M,int R)
    {
        int i=0;
        int p1=L;
        int p2=M+1;
        int[]help=new int[R-L+1];
        while(p1<=M&&p2<=R){

            if(a[p1]<a[p2])
            {
                help[i++]=a[p1++];
            }else{
                help[i++]=a[p2++];
            }
        }
        while(p1<=M)
        {
            help[i++]=a[p1++];
        }
        while(p2<=R)
        {
            help[i++]=a[p2++];
        }
        for(int i1=0;i1<help.length;i1++)
        {
            a[L+i1]=help[i1];
        }
    }
}
*/
public class MergeSort{
    public static void main(String[] args) {
        int []a={0,4,6,2,3,1,5,3,6};
        process(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void process(int[]a,int L,int R)
    {
        if(L==R)
        {
            return;
        }
        int mid=L+((R-L)>>1);
        process(a,L,mid);
        process(a,mid+1,R);
        merge(a,L,mid,R);
    }
    public static void merge(int[]a,int L,int M,int R)
    {
        int p1=L;
        int p2=M+1;
        int[]help=new int[R-L+1];
        int i=0;
        while(p1<=M&&p2<=R)
        {
            help[i++]=a[p1]>a[p2]?a[p1++]:a[p2++];
        }
        while(p1<=M)
        {
            help[i++]=a[p1++];
        }
        while(p2<=R)
        {
            help[i++]=a[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            a[j+L]=help[j];
        }
    }
}