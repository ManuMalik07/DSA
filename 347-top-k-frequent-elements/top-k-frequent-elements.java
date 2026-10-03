class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int e:nums){
                freq.put(e,freq.getOrDefault(e,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));// to sort them according to maxHeap
        for(int num :freq.keySet()){
            pq.add(num);
        }
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
        

    }
}