class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        else
        {
            if(haystack.indexOf(needle)>-1)
            {
                return haystack.indexOf(needle);
            }
            else
                return -1;
        }
    }
}
