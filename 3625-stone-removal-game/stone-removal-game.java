class Solution {
    public boolean canAliceWin(int n) {
        // int take = 10;
        // int k = 0;
        // while (n >= take) {
        //     n -= take;
        //     take--;
        //     k++;
        // }
        // return k % 2 == 1;// number is odd

        if(n <= 9) return false;
if(n <= 18) return true;
if(n <= 26) return false;
if(n <= 33) return true;
if(n <= 39) return false;
if(n <= 44) return true;
if(n <= 48) return false;
return true;
        
    }
}