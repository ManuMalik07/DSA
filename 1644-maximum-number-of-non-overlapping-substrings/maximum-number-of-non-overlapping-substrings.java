class Solution {

    public List<String> maxNumOfSubstrings(String s) {

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);

        // Find first and last occurrence
        for (int i = 0; i < s.length(); i++) {

            int c = s.charAt(i) - 'a';

            if (first[c] == -1) {
                first[c] = i;
            }

            last[c] = i;
        }

        List<int[]> intervals = new ArrayList<>();

        // Find valid intervals
        for (int c = 0; c < 26; c++) {

            if (first[c] == -1) {
                continue;
            }

            int start = first[c];
            int end = last[c];

            boolean valid = true;

            for (int i = start; i <= end; i++) {

                int current = s.charAt(i) - 'a';

                // Character occurs before start
                if (first[current] < start) {
                    valid = false;
                    break;
                }

                // Include all occurrences of this character
                end = Math.max(end, last[current]);
            }

            if (valid) {
                intervals.add(new int[]{start, end});
            }
        }

        // Sort by ending position
        intervals.sort((a, b) -> a[1] - b[1]);

        List<String> ans = new ArrayList<>();

        int prevEnd = -1;

        // Greedy selection
        for (int[] interval : intervals) {

            int start = interval[0];
            int end = interval[1];

            if (start > prevEnd) {

                ans.add(s.substring(start, end + 1));

                prevEnd = end;
            }
        }

        return ans;
    }
}