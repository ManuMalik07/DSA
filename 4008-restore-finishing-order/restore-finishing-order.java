class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr =  new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for(int e : friends){
            set.add(e);
        }
        int j=0;
        for(int e : order){
            if(set.contains(e)){
                arr[j]=e;
                j++;
            }
        }
        return arr;     
            
        
    }
}