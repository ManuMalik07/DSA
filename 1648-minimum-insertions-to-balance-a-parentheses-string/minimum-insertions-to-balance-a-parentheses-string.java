class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // If the previous closing pair is incomplete
                if (open > 0 && i > 0 && s.charAt(i - 1) == ')') {
                    // handled by checking closing pairs below
                }
                open++;
            } else {
                // Check whether we have two consecutive ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    if (open > 0) {
                        open--;
                    } else {
                        insertions++; // Insert an opening '('
                    }
                    i++; // Consume the second ')'
                } else {
                    // Only one ')' is available, insert another ')'
                    if (open > 0) {
                        open--;
                        insertions++;
                    } else {
                        insertions += 2; // Insert '(' and another ')'
                    }
                }
            }
        }

        return insertions + open * 2;
    }
}