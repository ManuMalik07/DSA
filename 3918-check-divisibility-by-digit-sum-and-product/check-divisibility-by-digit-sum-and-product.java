class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int dsum=0;
        int psum=1;
        while(n!=0){
            dsum += n%10;
            psum *= n%10;
            n=n/10;
        }
        int sum = dsum+psum;
        if(m%sum==0){
            return true;
        }
        return false;
        
    }
}