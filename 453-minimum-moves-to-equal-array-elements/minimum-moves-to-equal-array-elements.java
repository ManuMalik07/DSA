class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min=nums[0];
        // int max=nums[0];
        for(int i=1;i<n;i++){
            min= Math.min(min,nums[i]);
            // max= Math.max(max,nums[i]);
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i]-min;
        }
        return sum;
    }
}