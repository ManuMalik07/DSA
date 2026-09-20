class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    char lowerCh = Character.toLowerCase(ch);
                    int charValue = 26 - (lowerCh - 'a');
                    int position = i + 1;
                    totalSum += charValue * position;
        }
        
        return totalSum;
        
    }
}