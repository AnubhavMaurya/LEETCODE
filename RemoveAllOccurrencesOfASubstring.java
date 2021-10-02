class Solution {
    public String removeOccurrences(String s, String part) {
        String temp=s.replaceFirst(part,"");
        String ch="";
        for(;;)
        {
            ch=temp.replaceFirst(part,"");
            if(ch.equals(temp))
                break;
                 temp=ch;
        }
        return ch;
    }
}
