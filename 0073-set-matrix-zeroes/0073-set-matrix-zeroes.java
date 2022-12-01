class Solution {
    public void setZeroes(int[][] matrix) {
        int flag=0;
         for(int row=0;row<matrix.length;row++){
          for(int col=0;col<matrix[row].length;col++){
           
            if(matrix[row][col]==0){
              
                 for(int k=0;k<matrix[row].length;k++){
                    if(matrix[row][k] !=0)
                      matrix[row][k]=-1;
                 }
                  for(int k=0;k<matrix.length;k++){
                    if(matrix[k][col] !=0)
                      matrix[k][col]=-1;
                 }
                flag=1;
            }
            }
          
          
        }
       if(flag==1){
        for(int r=0;r<matrix.length;r++)
         {
           for(int c=0;c<matrix[r].length;c++){
             if(matrix[r][c]==-1)
                matrix[r][c]=0;
           }
         }
       }
    }
    
    
    
    
    
}