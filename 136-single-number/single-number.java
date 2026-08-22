class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int e : nums){
            h.put(e,h.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
        
    }
}