class Solution {
    public int subtractProductAndSum(int n) {
        int temp,sum=0,mul=1;
        while(n>0)
        {
            temp=n%10;
            sum+=temp;
            mul*=temp;
            n=n/10;
        }
        return (mul-sum);
    }
}
