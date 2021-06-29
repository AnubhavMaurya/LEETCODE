class Solution {
    public int reverse(int x) {
        long temp=0;
        int d,chk=0;
        long y=x;
        if(y<0)
        {
            y=-y;
        chk=1;
        }
            while(y!=0)
        {
            d=(int)y%10;
            temp=temp*10+d;
            y=y/10;
        }
        if(chk==1)
        {
            temp=-temp;
        }
        if(-2147483648>temp||temp>2147483647)
            return 0;
        else
        return (int)temp;
    }
}
