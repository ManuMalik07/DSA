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
            xorsum ^= e;//  output =2;
        }
        for(int i=0;i<=n;i++){
            xorsum = xorsum ^i;// it will remore all the dublicate ones and give the missing ans
        }
        return xorsum;
        
    }
}