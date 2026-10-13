class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long ans =0;
        long maxsum=0;
        long minsum=0;
        for(int i=0;i<n;i++){
                nums[i]=(int)Math.pow(nums[i],2);
            }
        Arrays.sort(nums);

        for(int i=n/2;i<n;i++){
                maxsum += nums[i];
            }
            for(int i=0;i<n/2;i++){
                minsum += nums[i];
            }
            ans = maxsum-minsum;
        // if(n%2==0){
        //     for(int i=n/2;i<n;i++){
        //         maxsum += nums[i];
        //     }
        //     for(int i=0;i<n/2;i++){
        //         minsum += nums[i];
        //     }
        //     ans = maxsum-minsum;
        // }else{
        //     for(int i=(n/2);i<n;i++){
        //         maxsum += nums[i];
        //     }
        //     for(int i=0;i<n/2;i++){
        //         minsum += nums[i];
        //     }
        //     ans = maxsum-minsum;

        // }
        return ans ;
        
    }
}