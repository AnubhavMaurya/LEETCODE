class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length;
      int temp;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if((nums[j]%2==0)&&(nums[i]%2!=0))
                {
               temp=nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
                }
            }
        }
        return nums;
    }
}
