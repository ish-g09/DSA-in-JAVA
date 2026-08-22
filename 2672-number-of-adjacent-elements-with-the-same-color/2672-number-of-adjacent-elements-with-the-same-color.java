class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int len=queries.length;
        int colors[]=new int[n];
        Arrays.fill(colors,-1);
        int result[]=new int[len];
        colors[queries[0][0]]=queries[0][1];
        // result[]
        int adjp=0;
        for(int i=1; i<len; i++){
            
            int color=queries[i][1];
            int t=queries[i][0];
            if(colors[t]!=-1){
            if(t>=0 && t!=n-1){
                if(colors[t]==colors[t+1]) adjp--;
               
            }
            if(t<n && t!=0){
                if(colors[t]==colors[t-1]) adjp--;
                
            }
            }
            colors[t]=color;
            if(t>=0 && t!=n-1){
                if(colors[t]==colors[t+1]) adjp++;
               
            }
            if(t<n && t!=0){
                if(colors[t]==colors[t-1]) adjp++;
                
            }
            result[i]=adjp;
        }
        return result;
    }
}