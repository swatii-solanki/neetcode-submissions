class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList();

        int top_bound = 0;
        int left_bound = 0;
        int right_bound = n-1;
        int bottom_bound = m-1;

        while(ans.size() < m*n) {
            // row = 0
            // col = 0 - n-1
            for(int i = left_bound; i <= right_bound; i++) {
                ans.add(matrix[top_bound][i]);
            }
            top_bound++;

            // col = n-1
            // row = 1 - m-1
            for(int i = top_bound; i <= bottom_bound; i++) {
                ans.add(matrix[i][right_bound]);
            }
            right_bound--;


            // row = m-1
            // col = n-2 - 0
            if (top_bound <= bottom_bound) {
                for(int i = right_bound; i >= left_bound; i--) {
                    ans.add(matrix[bottom_bound][i]);
                }
                bottom_bound--;
            }


            // col = 0
            // row = m-2 - 1
            if (left_bound <= right_bound) {
                for(int i = bottom_bound; i >= top_bound; i--) {
                    ans.add(matrix[i][left_bound]);
                }
                left_bound++;
            }
        }

        return ans;
    }
}
