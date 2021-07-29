class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int count=0;
         a[0]=-1;
         a[1]=-1;
        int l=nums.length;
        if(l==0)
        {
            return a;
        }
        else
        {
            for(int i=0;i<l;i++)
            {
                if(nums[i]==target)
                {
                    if(count==0)
                    {
                    a[0]=i;
                    a[1]=i;
                    count=1;
                    }
                    else
                    {
                        a[1]=i;
                    }
                }
                
            }
            return a;
        }
    }
}
