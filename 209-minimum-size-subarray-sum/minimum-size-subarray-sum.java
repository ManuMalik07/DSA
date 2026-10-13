class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n =arr.length;
        int minlength=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum =0;
        //     int j=i;
           
        //     while(j<n && sum<target){
        //         sum +=arr[j];
        //         j++;
        //     }
        //     j--;
        //     int l = j-i+1;
        //     if(sum>=target)minlength=Math.min(minlength,l);
        // }



        // Slinding window Approach 
        int i=0,j=0,sum=0;
        while(j<n && sum<target){
            sum += arr[j];
            j++;
        }
        j--;
        while(j<n && i<n){
            int len = j-i+1;
            if(sum>=target)minlength = Math.min(minlength, len);
            sum -=arr[i];
            i++;
            j++;
            while(j<n && sum<target){
                sum +=arr[j++];
            }
            j--;
            
        }
        if(minlength == Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
        
    }
}