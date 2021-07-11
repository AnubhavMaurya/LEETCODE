class Solution {
    public String restoreString(String s, int[] indices) {
       char ch[]=new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
           ch[indices[i]]=s.charAt(i); 
         //   ch[i]=s.charAt(indices[i]);
        }
        s=String.valueOf(ch);
        return s;
    }
}
