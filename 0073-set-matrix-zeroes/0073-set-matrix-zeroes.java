class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col= matrix[0].length;
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
               ans[i][j]=matrix[i][j] ;

// traversing in original matrix to find 0s
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    for(int cols=0;cols<col;cols++)  ans[i][cols]=0;
                    for(int rows=0;rows<row;rows++)  ans[rows][j]=0;
                }
            }
        }   
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                matrix[i][j]=ans[i][j];    
        
    }
}