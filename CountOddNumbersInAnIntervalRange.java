class Solution {
    public int countOdds(int low, int high) {
        int result=0;
        if(high%2==0 && low%2==0)
        {
            result=(high-low)/2;
        }
        else
            result=((high-low)/2)+1;
        return result;
    }
}
