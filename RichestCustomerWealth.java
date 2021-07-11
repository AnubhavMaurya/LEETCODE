class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0,temp=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                temp+=accounts[i][j];
            }
            if(temp>max)
            {
                max=temp;
            }
            temp=0;
        }
        return max;
    }
}