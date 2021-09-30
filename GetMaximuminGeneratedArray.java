class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0)
            return 0;
        int[] a=new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=1;i<(n+1)/2;i++)
        {
            a[2*i]=a[i];
            a[(2*i)+1]=a[i]+a[i+1];
        }
        Arrays.sort(a);
        return a[n];
    }
}
