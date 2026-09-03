class Solution {
    public boolean uniformArray(int[] nums1) {
        int counteven=0;
        int n= nums1.length;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                counteven++;
            }
        }
        if(counteven==n || counteven==0){
            return true;
        }
        int[] nums2 = new int[n];
        int smallestOdd= nums1[0];
        for(int i=1;i<n;i++){
            if(nums1[i]%2 !=0 && nums1[i]<smallestOdd){
                    smallestOdd= nums1[i];
            }

        }
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(nums1[i] %2 !=0 ){
                nums2[i]=nums1[i];
            }else{
                nums2[i]=nums1[i]-smallestOdd;
                if(nums2[i]<=0){
                    flag =false;
                }

                
            }
        }

        return flag;
        
    }
}