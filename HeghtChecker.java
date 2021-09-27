class Solution {
    public int heightChecker(int[] heights) {
        int i,j,temp,count=0;
        for (i= 0; i <heights.length- 1; i++) {
       int min = i;
      for (j = i+ 1; j <heights.length; j++) {
        if (heights[j] < heights[min]) {
          min = j;
            count++;
        }
      }
           // System.out.print(height[i]);   
       }
        return count;
    }
}
