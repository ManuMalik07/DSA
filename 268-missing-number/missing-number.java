class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // int Actualsum = (n*(n+1))/2;
        // int sum=0;
        // for(int e:nums){
        //     sum += e;
        // }
        // return Actualsum-sum;


        //XOR sum approach 
        int xorsum=0;
        for(int e:nums){
            xorsum ^= e;
        }
        for(int i=0;i<=n;i++){
            xorsum = xorsum ^i;
        }
        return xorsum;
        
    }
}