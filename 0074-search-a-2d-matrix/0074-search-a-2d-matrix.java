class Solution {
    public boolean searchMatrix(int[][] matrix, int x) {
         for(int r=0;r<matrix.length;r++){
	        for(int c=0;c<matrix[r].length;c++){
	            if(matrix[r][c]==x)
	            return true;
	        }
	    }
	    return false;  
    }
}