class Solution {
    public void moveZeroes(int[] nums) {
       int l=nums.length;
        int temp=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                nums[temp]=nums[i];
            temp++;
            }
        }
        for(int i=temp;i<l;i++)
        {
            nums[i]=0;
        }
    }
}
