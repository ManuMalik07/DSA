class Solution {
    static int timetaken(int[] piles,int k ){
        int time=0;
        for(int i=0;i<piles.length;i++){
            // time = time + (int)Math.ceil((double)piles[i]/k);
            time += (piles[i]+k-1)/k;
        }
        return time;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        
        while(low<high){
            int k = low+((high-low)/2);
            int time =timetaken(piles,k);
           
            if(time<=h){
                high=k; 
            }
            else{
                low = k+1;
            }
        }
        return low;

        
    }
}