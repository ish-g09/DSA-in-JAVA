class Solution {
    public int maxEvents(int[][] events) {
        int n=events.length;
        Arrays.sort(events, (a,b)->
        {if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
        else return Integer.compare(a[1],b[1]);
        });
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int i=0;
        int day=0;
        int count=0;
        while(i<n || !pq.isEmpty()){
            if(pq.isEmpty()){
                day=events[i][0];
            }
            while(i<n && day>=events[i][0]){
                pq.offer(events[i][1]);
                i++;
            }
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                count++;
                day++;
            }
        }
        return count;
        

    }
}