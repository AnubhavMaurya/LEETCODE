class Solution {
    public boolean checkIfPangram(String sentence) {
    int check=0;
        for(char ch='a';ch<='z';ch++)
    {
        check=sentence.indexOf(ch);
            System.out.println(check);
            if(check==-1)
                return false;
    }
        return true;
    }
}
 
