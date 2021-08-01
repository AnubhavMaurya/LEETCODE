class Solution {
    public int addDigits(int num) {
        int temp,sum=num;
        for(;;)
        {
        if(sum>9)
        {
            num=sum;
            sum=0;
        while(num>0)
        {
            temp=num%10;
            sum+=temp;
            num=num/10;
        }
        }
            else
                return sum;
        }
    }
}
