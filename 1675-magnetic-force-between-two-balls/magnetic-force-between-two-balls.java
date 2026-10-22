class Solution {
    static boolean canweplace(int[] pos , int balls , int dist){
        int placedball=1;
        int lastpos= pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-lastpos>=dist){
                placedball++;
                lastpos=pos[i];
            }
            if(placedball>=balls){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] pos, int balls) {
        int n = pos.length;
        Arrays.sort(pos);
        int low=1;
        int high = pos[n-1]-pos[0];
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canweplace(pos,balls,mid)){
                ans = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        
    }
}