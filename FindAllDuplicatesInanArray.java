class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         Arrays.sort(nums);
        List ls=new ArrayList();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                ls.add(nums[i]);
        }
        return ls;
    }
}
