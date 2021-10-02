class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0 || n==2)
            return false;
        else if(n==1)
            return true;
        else
        {
            int flag=0;
            double temp=n;
            while(temp>1)
            {
                temp=temp/3;
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
