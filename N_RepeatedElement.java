class Solution {
    public int repeatedNTimes(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int count=0;
      for(int i=0;i<l;i++)
      {
         for(int j=i;j<l;j++)
         {
             if(nums[i]==nums[j])
             {
              count++;
              if(count==l/2)
              {
                  return nums[i];
              }
              }
             else break;
         }
          count=0;
      }
        return 0;
    }
}
