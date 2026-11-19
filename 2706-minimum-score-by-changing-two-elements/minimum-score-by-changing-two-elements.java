class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[n-1]-nums[2];//two smallest 
        int b = nums[n-3]-nums[0];//two largest 
        int c = nums[n-2]-nums[1]; //largest and smallest
        return Math.min(Math.min(a,b),c);

        
    }
}