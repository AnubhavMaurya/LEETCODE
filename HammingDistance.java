class Solution {
    public int hammingDistance(int x, int y) {
       int result=x^y;
        String str=Integer.toBinaryString(result);
       int sum=0;
            for(int i=str.length()-1;i>=0;i--)
            {
           if(str.charAt(i)=='1')
           {
               sum++;
           }
               
       }
        return sum;
    }
}
