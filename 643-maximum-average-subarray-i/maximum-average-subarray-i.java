class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int right =k-1;
        int sum =0;
        double avg = Double.NEGATIVE_INFINITY;
        while(right<nums.length && right-left+1==k){
            sum=0;
            for(int i=left;i<=right;i++){
            sum += nums[i];
            }
            avg= Math.max(avg,(double)sum/k);
            left++;
            right++;
        }
        
        return avg;

    }
}