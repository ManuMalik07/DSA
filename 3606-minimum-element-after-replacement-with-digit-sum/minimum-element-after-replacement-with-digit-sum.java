class Solution {
    static int digitSum(int n){
        int sum=0;
        while(n !=0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i]=digitSum(nums[i]);
        }
        int min = Arrays.stream(nums).min().getAsInt();
        return min;
        
    }
}