class Solution {
    public int maximumProduct(int[] nums) {
      int temp=nums.length;
       int max=0;
        Arrays.sort(nums);
return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]* nums[nums.length - 3]);
    }
}
