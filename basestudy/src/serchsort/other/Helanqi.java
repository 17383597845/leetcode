package serchsort.other;
//快排知识准备
public class Helanqi {
    public static void main(String[] args) {
        int a[]={1,5,3,7,5,4,8,5};
        partition(a,0,a.length-1,5);
        for(int x:a)
        {
            System.out.println(x);
        }
    }
    public static void partition(int[]a,int L,int R,int num)
    {
        int b=0,s=0;
        for (int i = L; i <= R-s; i++) {
            if(a[i]>num)
            {
                swap(a,i,R-s);
                s++;
                i--;
            }else if(a[i]<num)
            {
                swap(a,i,L+b);
                b++;
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
