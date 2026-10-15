class Solution {
    public int mySqrt(int n) {
        if(n<2){
            return n;
        }
        int ans=0;
        int low=1;
        int high = n/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid <=n/mid){//this is causing overflow so insted of mid*mid i wil fo mid=n/mid
                ans=mid;
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return ans ;
    }
}