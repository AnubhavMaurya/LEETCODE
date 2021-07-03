class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        int i,check=0;
        Arrays.sort(nums);
        if(len>1)
        {
        if(nums[0]!=nums[1])
        {  check=nums[0];}
        for(i=1;i<len-1;i++)
        {
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1])
                check=nums[i];
        }
        if(nums[i-1]!=nums[i])
        {check=nums[i];}
        }
        else
            check=nums[0];
    return check;
    }
}
