class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Check if the character is a letter
           
                // Convert to lowercase to handle both cases uniformly
                char lowerCh = Character.toLowerCase(ch);
                
                // 'a' becomes 26, 'b' becomes 25, ..., 'z' becomes 1
                int charValue = 26 - (lowerCh - 'a');
                
                // Position is 1-indexed, so we use (i + 1)
                int position = i + 1;
                
                totalSum += charValue * position;
            
        }
        
        return totalSum;
        
    }
}