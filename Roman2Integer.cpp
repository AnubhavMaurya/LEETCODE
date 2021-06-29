class Solution {
public:
    int romanToInt(string s) {
           int result=0;
       for(int i = 0; i < s.size(); i++) {
            if(chk(s[i]) < chk(s[i+1])) {
                result -= chk(s[i]);
            }
            else {
                result += chk(s[i]);
            }    
            }
        return result;
    }

int chk(char ch)
{
    switch(ch)
    {
        case 'I':return(1);
        case 'V':return(5);
        case 'X':return(10);
        case 'L':return(50);
        case 'C':return(100);
        case 'D':return(500);
        case 'M':return(1000);
        default:return 0;
    }
}
};
