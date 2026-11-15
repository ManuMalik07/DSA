class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        // int count =0;
        // for(int i=0;i<n;i++){
        //     int sum =0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         if(sum %2 != 0){
        //             count++;
        //         }
        //     }
        // }from this methoed i am getting TLE
        int odd = 0;
        int even = 1;  // Empty prefix
        int sum = 0;
        int count = 0;

        for (int x : arr) {

            sum += x;
            count= count%(1000000007);
            if (sum % 2 == 0) {
                
                count += odd;
               
                even++;
            } 
            else {
                
                count += even;
                odd++;
            }
        }
        return count;
        
    }
}