package weiyunsuan;

public class Test01 {
    public static void main(String[] args) {
        //只有一个数有奇数个
        /*int[]a={0,0,1,1,2,2,5,5,4,6,7,6,5,7,4};
        int odd=0;
        for(int i:a){
            odd^=i;
        }
        System.out.println(odd);*/
        //有两个数有奇数个
        int[]a={0,0,1,1,2,2,5,5,4,6,7,6,5,7,4,0};
        int odd=0;
        for(int i:a){
            odd^=i;
        }
        int odd1=0;
        int end=odd&(~odd+1);
        for(int i:a)
        {
            if((i&end)==1)
            {
                odd1^=i;
            }
        }
        System.out.println(odd1+" "+(odd^odd1));

    }
}
