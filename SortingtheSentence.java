class Solution {
    public String sortSentence(String s) {
        String ch[]=s.split(" ");
        s="";
        int i,l1=0,l2=0;
        for(i=0;i<ch.length-1;i++)
        {
         for(int j=i+1;j<ch.length;j++)
         {
                l1=ch[i].length()-1;
             l2=ch[j].length()-1;
             if(ch[i].charAt(l1)>ch[j].charAt(l2))
                    {
                      String temp=ch[i];
                      ch[i]=ch[j];
                      ch[j]=temp;
                  }
         } 
    // return str.replaceAll("\\d", "");        
        s+=s.valueOf(ch[i]);}
        
        s+=s.valueOf(ch[i]);
       
       s=s.replaceAll("\\d", " ");
        return s.substring(0,s.length()-1);
        //  return s;
    }
}
