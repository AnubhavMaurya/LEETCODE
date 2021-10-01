class Solution {
    public char findTheDifference(String s, String t) {
        char ch[]=s.toCharArray();
        char che[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(che);
        int i;
        for(i=0;i<s.length();i++)
        {
            if(ch[i]!=che[i])
                break;
        }
        return che[i];
    }
}
