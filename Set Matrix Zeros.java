class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
      Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0;i < n; i++) {
            for(int j = 0;j < m; j++) {
                if(mat[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j< m; j++) {
                if(row.contains(i) || col.contains(j)) {
                    mat[i][j] = 0;
                }
            }
        }    
    }
}
