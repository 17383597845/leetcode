package serchsort.other;

//归并排序的高级变体
public class Smallsum {
    static int an=0;

    public static void main(String[] args) {
        int []a={0,4,6,2,3,1,5,3,6};
        process(a,0,a.length-1);
        System.out.println(an);
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
        merge(a,L,R,mid);
    }

    public static void merge(int[]a,int L,int R,int M)
    {
        int p1=L,p2=M+1;
        int i=0;
        int[]help=new int [R-L+1];

        while(p1<=M&&p2<=R)
        {
           an+=a[p1]<a[p2]?a[p1]*(R-p2+1):0;
           help[i++]=a[p1]<a[p2]?a[p1++]:a[p2++];
        }
        while(p1<=M)
        {
            help[i++]=a[p1++];
        }
        while(p2<=R)
        {
            help[i++]=a[p2++];
        }
        for(int j=0;j<help.length;j++)
        {
            a[j+L]=help[j];
        }
    }
}
