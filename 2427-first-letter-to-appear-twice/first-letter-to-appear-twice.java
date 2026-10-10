class Solution {
    public char repeatedCharacter(String s) {
        int n  = s.length();
        char ans='a';
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                ans= s.charAt(i);
                break;
            }
            set.add(s.charAt(i));
        }
        return ans ;
        
    }
}