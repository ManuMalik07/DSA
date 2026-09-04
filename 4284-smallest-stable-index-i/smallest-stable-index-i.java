class Solution {
    static int findmax(int[] nums, int start , int end){
        int max = nums[start];
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max= nums[i];
            }
        }
        return max;
    }
    static int findmin(int[] nums, int start , int end){
        int min = nums[start];
        for(int i=start;i<=end;i++){
            if(nums[i]<min){
                min= nums[i];
            }
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int max = findmax(nums,0,i);
            int min = findmin(nums,i,n-1);
            arr[i]=max-min;
        }
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                index =i;
                break;
            }
            
        }
        return index;

        
         
        
    }
}