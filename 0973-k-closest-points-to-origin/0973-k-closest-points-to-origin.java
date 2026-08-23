class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][]result=new int[k][2];
        int n=points.length;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->(a.x*a.x+a.y*a.y)-(b.x*b.x+b.y*b.y));
        for(int i=0; i<n; i++){
            int x=points[i][0];
            int y=points[i][1];
            pq.offer(new Pair(x,y));

        }
        int v=k;
        while(v>0){
            Pair t=pq.poll();
            result[k-v][0]=t.x;
            result[k-v][1]=t.y;
            v--;
        }
        return result;
    }
}