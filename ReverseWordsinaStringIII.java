class Solution {
    public String reverseWords(String s) {
         String ch[]=s.split(" ");
        String str="";
        String temp="";
        for(int i=0;i<ch.length;i++)
        {
        temp=temp.valueOf(ch[i]);
            StringBuilder sb=new StringBuilder(temp);
            
        str+=sb.reverse()+" ";
        }
        return str.substring(0,str.length()-1);
    }
}
