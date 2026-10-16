
import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    int n;
    long[] sum, sumSq, lazy;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        sumSq = new long[4 * n];
        lazy = new long[4 * n];

        Map<Integer, Integer> last = new HashMap<>();

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int prev = last.getOrDefault(nums[i], -1);
            last.put(nums[i], i);

            update(1, 0, n - 1, prev + 1, i);

            ans = (ans + sumSq[1]) % MOD;
        }

        return (int) ans;
    }

    void apply(int node, int l, int r, long k) {
        long len = r - l + 1L;

        sumSq[node] = (
            sumSq[node] + 2L * k * sum[node] % MOD
            + k * k % MOD * len % MOD
        ) % MOD;

        sum[node] = (sum[node] + k * len) % MOD;
        lazy[node] += k;
    }

    void push(int node, int l, int r) {
        if (lazy[node] == 0 || l == r) return;

        int mid = (l + r) / 2;
        long k = lazy[node];

        apply(node * 2, l, mid, k);
        apply(node * 2 + 1, mid + 1, r, k);

        lazy[node] = 0;
    }

    void update(int node, int l, int r, int ql, int qr) {
        if (ql > r || qr < l || ql > qr) return;

        if (ql <= l && r <= qr) {
            apply(node, l, r, 1);
            return;
        }

        push(node, l, r);

        int mid = (l + r) / 2;

        update(node * 2, l, mid, ql, qr);
        update(node * 2 + 1, mid + 1, r, ql, qr);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;

        sumSq[node] = (
            sumSq[node * 2] + sumSq[node * 2 + 1]
        ) % MOD;
    }
}
