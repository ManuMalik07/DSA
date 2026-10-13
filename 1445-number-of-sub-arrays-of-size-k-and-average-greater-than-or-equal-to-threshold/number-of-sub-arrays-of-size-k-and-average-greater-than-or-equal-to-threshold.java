class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count=0;
        int sum =0;
        int minsum=k*threshold;
        for(int a=0;a<k;a++){
            sum += arr[a];
        }
        if(sum>=minsum){
            count++;
        }
        int i=1;
        int j=k;
        while(j<n){
            sum = sum-arr[i-1]+arr[j];
            if(sum >= minsum){
                count++;
            }
            i++;
            j++;
        }

        
        return count;
    }
}