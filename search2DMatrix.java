class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int out = 0; out < matrix.length; out++){
            for (int in = 0; in < matrix[out].length; in++){
                if(matrix[out][in]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
