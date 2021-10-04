class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
    int str1=strs[0].length();
    int str2=strs[strs.length-1].length();
        for(int i=0;i<str1;i++)
        {
           if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
               return strs[0].substring(0,i);
        }
    return strs[0];
    }
}
