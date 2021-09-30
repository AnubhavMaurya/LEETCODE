class Solution {
    public boolean divisorGame(int n) {
        int flag=1;
        while(n>1)
        {
            if(n%2==0)
            {
                n-=1;
                flag++;
            }
            else
            {
                n=n-(n-2);
                flag++;
            }
        }
        if(flag%2==0)
        {
            return true;
        }
        else
            return false;
    }
}
