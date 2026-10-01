class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char c='*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else  if(s.charAt(i)==')'){
                 if(st.size()==0) return false;
                c=st.peek();
                if(c=='(') st.pop();
                else st.push(s.charAt(i));
            }
             else  if(s.charAt(i)==']'){
                if(st.size()==0) return false;
                c=st.peek();
                if(c=='[') st.pop();
                 else st.push(s.charAt(i));
            }
             else  if(s.charAt(i)=='}'){
                if(st.size()==0) return false;
                c=st.peek();
                if(c=='{') st.pop();
                 else st.push(s.charAt(i));
            }
        }
        if(st.size()!=0) return false;
      return true;
        
    }
}