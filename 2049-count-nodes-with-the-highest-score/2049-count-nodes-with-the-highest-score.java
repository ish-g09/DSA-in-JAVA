class Solution {
    public int countHighestScoreNodes(int[] parents) {
        List<List<Integer>>children=new ArrayList<>();
        int n=parents.length;
        for(int i=0; i<n; i++){
            children.add(new ArrayList<>());
        }
        for(int i=1; i<n; i++){
            children.get(parents[i]).add(i);
        }
        int subtree[]=new int[n];
         dfs(0,children,subtree);
         long maxScore=0;
         int cnt=0;
        for(int i=0; i<n; i++){
           long score=1;
           for(int child:children.get(i)){
            score*=subtree[child];
           }
           if(i!=0){
            score*=n-subtree[i];
           }
           if(score>maxScore){
            maxScore=score;
            cnt=1;
           }
           else if(score==maxScore){
            cnt++;
           }
        }
        return cnt;
    }
    int dfs(int node,List<List<Integer>>children, int subtree[]){
        int size=1;
        for(int child:children.get(node)){
            size+=dfs(child, children, subtree);
        }
        subtree[node]=size;
        return size;
    }
}