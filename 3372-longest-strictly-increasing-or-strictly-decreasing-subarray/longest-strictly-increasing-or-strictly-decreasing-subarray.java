class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlength = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int currlength = 1;
            for (int j = i; j < n-1; j++) {
                if (nums[j] < nums[j + 1]) {
                    currlength++;
                } else {
                    break;
                }
            }
            maxlength = Math.max(currlength, maxlength);
        }

        for (int i = 0; i < n; i++) {
            int currlength = 1;
            for (int j = i; j < n-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    currlength++;

                } else {
                    break;
                }
            }
            maxlength = Math.max(currlength, maxlength);
        }
        return maxlength;
    }
}