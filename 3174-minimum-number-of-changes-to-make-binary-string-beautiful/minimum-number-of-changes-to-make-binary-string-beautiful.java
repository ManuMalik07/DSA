class Solution {
    public int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            int idx1 = i*2;
            int index2 = i*2+1;
            char ch1 = s.charAt(idx1);
            char ch2 = s.charAt(index2);
            if(ch1 != ch2){
                count++;
            }
        }
        return count ;
    }
}