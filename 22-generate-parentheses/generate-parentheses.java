class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate("",n,ans);
        return ans ;
        
    }
    void generate(String p,int n , List<String> ans){
        if(p.length() == n*2){
            if(isValid(p)){
                ans.add(p);
            }
            return;
        }
        generate(p+"(",n,ans);
        generate(p+")",n,ans);
    }

    boolean isValid(String p){
        int add=0;
        for(char ch : p.toCharArray()){
            if(ch == '('){
                add++;
            }else{
                add--;
            }
            if(add <0){
            return false;
        }
        }
        
        return add==0;
        
    }
}