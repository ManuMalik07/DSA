class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        // long ans =0;
        int n = nums1.length;
        // for(int i=0;i<n;i++){
        //     ans = ans +(int)Math.pow((nums1[i]-nums2[i]),2);
        // }
        // return ans;
        // int[] num3= new int[n];
        // for(int i=0;i<n;i++){
        //     num3[i]=Math.abs(nums1[i]-nums2[i]);
        // }
        // int k=k1+k2;
        // while(k>0){
        //     int max=num3[0];
        //     int p=0;
        //     for(int i=0;i<n;i++){
        //         if(num3[i]>max){
        //             max = num3[i];
        //             p=i;
        //         }
        //     }
        //     max = max-1;
        //     num3[p]=max;
        //     k--;
        // }
        // long sum =0;
        //  for (int i=0;i<n;i++){
        //     sum = sum + (long)Math.pow(num3[i],2);
        //  }
        //  return sum;


        int[] freq = new int[100001];
        long k = (long) k1 + k2;

            for (int i = 0; i < n; i++) {
                freq[Math.abs(nums1[i] - nums2[i])]++;
            }

            for (int d = 100000; d > 0 && k > 0; d--) {
                if (freq[d] == 0) continue;

                long use = Math.min(k, freq[d]);
                freq[d] -= use;
                freq[d - 1] += use;
                k -= use;
            }

            long ans = 0;

            for (int d = 1; d <= 100000; d++) {
                ans += (long) d * d * freq[d];
            }

            return ans;




        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for (int i = 0; i < n; i++) {
        //     pq.offer(Math.abs(nums1[i] - nums2[i]));
        // }

        // long K = (long) k1 + k2;

        // while (K > 0 && pq.peek() > 0) {
        //     int largestDiff = pq.poll();
        //     pq.offer(largestDiff - 1);
        //     K--;
        // }

        // long result = 0;
        // while (!pq.isEmpty()) {
        //     long d = pq.poll();
        //     result += d * d;
        // }

        // return result;   
        // this will give TLE k>0 10power 9

        
    }
}