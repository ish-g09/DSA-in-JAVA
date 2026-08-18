class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        for(int i=0; i<m; i++){
            int right=n-1;
            for(int j=n-1; j>=0; j--){
                if(boxGrid[i][j]=='*'){
                    right=j-1;

                }
                else if(boxGrid[i][j]=='#'){
                    boxGrid[i][j]='.';
                    boxGrid[i][right]='#';
                    //take care of this
                    right--;
                }
            }
        }
        char result[][]=new char[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result[j][m-i-1]=boxGrid[i][j];
            }
        }
        return result;
    }
}