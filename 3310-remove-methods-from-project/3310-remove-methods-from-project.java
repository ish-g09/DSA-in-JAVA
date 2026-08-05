class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < invocations.length; i++){
            adj.get(invocations[i][0]).add(invocations[i][1]);
        }

        boolean sus[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        sus[k] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i = 0; i < adj.get(curr).size(); i++){
                int next = adj.get(curr).get(i);
                if(!sus[next]){
                    sus[next] = true;
                    q.offer(next);
                }
            }
        }

        for(int i = 0; i < invocations.length; i++){
            int u = invocations[i][0];
            int v = invocations[i][1];
            if(!sus[u] && sus[v]){
                for(int j = 0; j < n; j++){
                    result.add(j);
                }
                return result;
            }
        }

        for(int i = 0; i < n; i++){
            if(!sus[i]){
                result.add(i);
            }
        }

        return result;
    }
}