public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int temp;
        long mid,min=1,max=n;
        if(n==1)
            return n;
        else
        while(true)
        {
           mid=(min+max)/2;
            temp=guess((int)mid);
            if(temp==0)
            {
                break;
            }
            else if(temp==1)
            {
                min=mid+1;
            }
            else if(temp==-1)
                max=mid-1;
        }
        return (int)mid;
    }
}
