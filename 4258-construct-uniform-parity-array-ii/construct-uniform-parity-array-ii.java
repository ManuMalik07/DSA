class Solution {
    public boolean uniformArray(int[] nums1) {
        int counteven=0;
        int n= nums1.length;
        int smallestOdd= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                counteven++;
            }
            if(nums1[i]%2 !=0 && nums1[i]<smallestOdd){
                smallestOdd= nums1[i];
            }
        }
        if(counteven==n || counteven==0){
            return true;
        }
        // int[] nums2 = new int[n];
        
        // boolean flag=true;
        // for(int i=0;i<n;i++){
        //     if(nums1[i] %2 !=0 ){
        //         nums2[i]=nums1[i];
        //     }else{
        //         nums2[i]=nums1[i]-smallestOdd;
        //         if(nums2[i]<=0){
        //             flag =false;
        //         }

                
        //     }
        // }
        for(int i=0;i<n;i++){
            if(nums1[i] %2 ==0){
                if(nums1[i] - smallestOdd <=0){
                    return false;
                }
            }
        }

        return true;
        
    }
}