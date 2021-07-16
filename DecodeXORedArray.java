class Solution {
    public int[] decode(int[] encoded, int first) {
        int temp[]=new int[encoded.length+1];
        temp[0]=first;
        for(int i=0;i<encoded.length;i++)
        {
            temp[i+1]=temp[i]^encoded[i];
        }
        return temp;
    }
}
