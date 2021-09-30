class Solution {
    public int tribonacci(int n) {
        int t1=0,t2=1,t3=1;
        int result=0,temp=0;
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        for(int i=3;i<=n;i++)
        {
            result=t1+t2+t3;
            temp=t1;
            t1=t2;
            t2=t3;
            t3=result;
        }
        return result;
    }
}
