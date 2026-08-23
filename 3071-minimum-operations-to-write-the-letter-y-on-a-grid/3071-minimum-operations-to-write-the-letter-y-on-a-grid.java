class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        int n=grid.length;
        int freqy[]=new int[3];
        int freqo[]=new int[3];
        for(int i=0; i<n/2+1; i++){
            for(int j=0; j<n; j++){
                if(i==j || i==n-1-j){
                    freqy[grid[i][j]]++;
                }
                else{
                    freqo[grid[i][j]]++;
                }
            }
        }
        for(int i=n/2+1; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==n/2){
                    freqy[grid[i][j]]++;
                }
                else{
                    freqo[grid[i][j]]++;
                }
            }
        }
        
        int totalY=0;
        int totalO=0;

        for(int i=0; i<3; i++){
            totalY+=freqy[i];
            totalO+=freqo[i];
        }
        int max=Integer.MAX_VALUE;
        for(int y=0; y<3; y++){
            for(int o=0; o<3; o++){
                if(o==y) continue;
                max=Math.min((totalY-freqy[y]+totalO-freqo[o]),max);
            }
        }
        return max;


    }
}