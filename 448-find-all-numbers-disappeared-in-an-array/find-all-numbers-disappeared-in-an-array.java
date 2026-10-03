class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        for(int e:nums){
            seen[e]=true;
        }
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                l.add(i);
            }
        }
        return l;
    }
}