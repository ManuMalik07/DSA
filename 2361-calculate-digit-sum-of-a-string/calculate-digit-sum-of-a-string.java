class Solution {
    private int sum(String s){
        int a =0;
        for(int i=0;i<s.length();i++){
            int b = s.charAt(i)-'0';
            a = a+b;
        }
        return a;
    }
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<s.length();i= i+k){
                StringBuilder str = new StringBuilder();
                if(i+k>s.length()){
                    str.append(s.substring(i,s.length()));
                }else{
                    str.append(s.substring(i,i+k));
                }
                int a = sum(str.toString());
                ans.append(a);
            }
            s=ans.toString();
        }
        return s;  
    }
}