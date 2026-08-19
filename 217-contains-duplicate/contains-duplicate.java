class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean flag= false;
        for(int e : nums){
            if(set.contains(e)){
                flag=true;
                return flag;
            }
            set.add(e);
        }
        return flag;
        
    }
}