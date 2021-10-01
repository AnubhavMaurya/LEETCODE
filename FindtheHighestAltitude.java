class Solution {
    public int largestAltitude(int[] gain) {
        int len=gain.length;
        int result[]=new int[len+1];
        int temp;
        result[0]=0;
        for(int i=0;i<len;i++)
        {
            result[i+1]=result[i]+gain[i];
        }
        Arrays.sort(result);
        return result[len];
    }
}
