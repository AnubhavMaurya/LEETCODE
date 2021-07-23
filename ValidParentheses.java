class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int l = s.length(),i=0;
        if(l<=1 || l%2!=0){
            return false;
        }
        while(l!=0){
            
            char c = s.charAt(i);
           
            if(c=='(' || c=='{'||c=='['){
                st.push(c);
            }else{
                
               if(!st.isEmpty()){
                    if(c==')' && st.peek()=='('){
                         st.pop();
                     }else if(c=='}' && st.peek()=='{'){
                        st.pop();
                    }else if(c==']' && st.peek()=='['){
                        st.pop();
                    }else{
                         return false;
                    }
               }else{
                   return false;
               }
                
            }
            
            i++;            
            l--;
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
