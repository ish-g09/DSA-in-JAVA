class Pair{
    int freq;
    int num;
    Pair(int freq, int num){
        this.freq=freq;
        this.num=num;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.freq-b.freq);
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        
        pq.offer(new Pair(entry.getValue(), entry.getKey()));
        if(pq.size()>k){
            pq.remove();
        }
        }
        int[]result=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            result[i]=pq.poll().num;
            i++;
        }
        return result;
    }
}