class Solution {
    public String reversePrefix(String word, char ch) {
        int len=word.indexOf(ch);
        if(len==-1)
            return word;
        else
        {            
            String str=word.substring(0,len+1);
            word=word.substring(len+1);
            
            StringBuilder sb=new StringBuilder(str);  
            sb.reverse();
            word=sb.toString() + word;
            return word;
        }
    }
}
