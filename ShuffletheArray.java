class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=n;
        int k=0;
        int arr[]=new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[k]=nums[i];
            k++;
            arr[k]=nums[n+i];
            k++;
        }
        return arr;
    }
}
