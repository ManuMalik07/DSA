class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
        //Now the question arrises how to sort it without using sorting 
        //  PriorityQueue<Integer> minh = new PriorityQueue<>();
        // for (int num: nums) {
        //     minh.add(num);
        //     if (minh.size() > k) {
        //         minh.remove();
        //     }
        // }
        
        // return minh.peek();
        
    }
}