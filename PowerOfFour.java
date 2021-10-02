class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0 || n==2 || n==3)
            return false;
        else if(n==1)
            return true;
        else
        {
            int flag=0;
            double temp=n;
            while(temp>1)
            {
                temp=temp/4;
                if(temp==1)
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
                return false;
            else
                return true;
        }
    }
}
