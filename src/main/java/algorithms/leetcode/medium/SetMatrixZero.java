package algorithms.leetcode.medium;
/*
73. Set Matrix Zeroes
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Constraints:
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1

 */
public class SetMatrixZero {
    /*
    APPROACH 1 :
       int r = matrix.length;
       int c = matrix[0].length;
       Set<Integer> row = new HashSet<>();
       Set<Integer> column = new HashSet<>();
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               int element = matrix[i][j];
               if(element==0){
                   row.add(i);
                   column.add(j);
               }
           }
       }

       Iterator i1 = row.iterator();
       while (i1.hasNext()){
           Integer element = (Integer) i1.next();
           for(int i=0; i<c;i++)
               matrix[element][i] = 0;
       }

       Iterator i2 = column.iterator();
       while (i2.hasNext()){
           Integer element = (Integer) i2.next();
           for(int i=0; i<r;i++)
               matrix[i][element] = 0;
       }
 */

    public static int[][] setZeroes(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        boolean[] row = new boolean[r];
        boolean[] column = new boolean[c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int element = matrix[i][j];
                if(element==0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(row[i] || column[j])
                    matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}

/*
Time complexity : O(r*c) + O(r*c) => O(r*c ^ 2)
Space complexity : O(r) + O(c) => O(r+c)
 */