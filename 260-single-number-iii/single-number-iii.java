class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int e : nums){
            h.put(e,h.getOrDefault(e,0)+1);
        }
        int[] result =new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:h.entrySet()){
            if(entry.getValue()==1){
                result[i]=entry.getKey();
                i++;
            }
        }
        return result ;
    }
}