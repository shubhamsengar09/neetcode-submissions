class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer>hp = new PriorityQueue((a,b) -> mp.get(a) - mp.get(b));
        for(int i :mp.keySet()){
            hp.add(i);
            if(hp.size()>k){
                hp.poll();
            }
        }
        int res [] = new int[k];
        for(int i=0;i<k;i++){
            res[i]= hp.poll();
        }
        return res;
    }
}
