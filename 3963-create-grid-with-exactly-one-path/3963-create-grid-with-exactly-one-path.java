class Solution {
    public String[] createGrid(int m, int n) {
        //.-free
        //#-obstacle
        String grid[][]=new String[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(grid[i], "#");
        }
        Arrays.fill(grid[0],".");
        for(int i=0; i<m; i++){
            grid[i][n-1]= ".";
        }
        String[] result=new String[m];

        for (int i=0; i<m; i++) {
            result[i] = String.join("", grid[i]);
        }

        return result;
        
    }
}