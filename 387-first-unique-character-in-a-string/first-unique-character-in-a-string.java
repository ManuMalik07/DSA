class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char e:s.toCharArray()){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int n = s.length();
        int count=-1;
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                count=i;
                break;
            }
        }
        return count;
    }
}