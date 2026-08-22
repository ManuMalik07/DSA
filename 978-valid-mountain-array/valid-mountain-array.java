class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        // if(n<3){
        //     return false;
        // }
        // boolean flag= true;
        // int peak=0;
        // for(int i=0;i < n-1;i++){
        //     if(arr[i+1]<arr[i]){
        //         peak=i;
        //         break;
        //     }
        // }
        // if(peak==0){
        //     return false;
        // }
        // for(int i=0;i < peak;i++){
        //     if(arr[i+1]==arr[i] || arr[i+1]< arr[i]){
        //         return false;

        //     }
        // }
        // for(int i=peak;i <n-1;i++){
        //     if(arr[i+1]==arr[i] || arr[i+1]> arr[i]){
        //         return false;
        //     }
        // }
        // return flag;

        // Much more simpler version is 

        int i=0;
        while(i<n-1 && arr[i]< arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i<n-1 && arr[i]>arr[i+1]){
            i++;
        }
        if(i==n-1){
            return true;
        }
        return false;


        
    }
}