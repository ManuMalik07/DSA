class Solution {
    public void reverseString(char[] s) {
        // String str  = new String(s);
        // StringBuilder sb = new StringBuilder(str).reverse();
        // System.out.print("[");
        // for( char ch : sb.toCharArray()){
        //         System.out.print(""ch,"");
        // }
        // System.out.print("]")

        // Use Two pointer Approach 
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }


        
    }
}