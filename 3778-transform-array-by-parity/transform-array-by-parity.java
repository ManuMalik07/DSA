class Solution {
    public int[] transformArray(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] %2 ==0){
        //         nums[i]=0;
        //     }
        //     else{
        //         nums[i]=1;
        //     }
        // }
        // Arrays.sort(nums);
        // return nums;
        int odd=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] %2 !=0){
                odd++;
            }
        }
        Arrays.fill(nums,0);
        for(int i=n-1;i>=(n-1)-odd+1;i--){
            nums[i]=1;
        }
        return nums;
    }
}