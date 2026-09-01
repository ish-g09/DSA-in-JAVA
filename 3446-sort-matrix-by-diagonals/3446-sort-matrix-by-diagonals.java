class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int col=1; col<n; col++){
            ArrayList<Integer> hs = new ArrayList<>();
            int row=0;
            int c=col;
                
                while (row < n && c < n) {
                hs.add(grid[row][c]);
                row++;
                c++;
                }
            
        
            row = 0;
            c = col;
            int i=0;
                  
            Collections.sort(hs);
            
            while (row < n && c < n) {
                grid[row][c] = hs.get(i);
                row++;
                c++;
                i++;
            }
           

        }
        for(int row=0; row<n; row++){
            ArrayList<Integer> hs = new ArrayList<>();
            int r=row;
            int c=0;
                
                while (r < n && c < n) {
                hs.add(grid[r][c]);
                r++;
                c++;
                }
            
        
            r = row;
            c = 0;
            int i=0;
                  
            Collections.sort(hs);
            Collections.reverse(hs);
            
            while (r < n && c < n) {
                grid[r][c] = hs.get(i);
                r++;
                c++;
                i++;
            }
           

        }
         return grid;
    }
}