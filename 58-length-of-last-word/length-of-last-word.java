class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String l = arr[arr.length-1];
        int n= l.length();
        return n;
        
        
    }
}