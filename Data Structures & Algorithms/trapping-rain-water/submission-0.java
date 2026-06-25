class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int max_area = 0;

        int[] left_max = new int[n];
        int[] right_max = new int[n];

        left_max[0] = height[0];
        right_max[n-1] = height[n-1];

        for(int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i],left_max[i-1]);
        }

        for(int i = n-2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }
        
        for(int i = 1; i < n-1; i++) {
            int min = Math.min(left_max[i-1], right_max[i+1]);

            int diff = min - height[i];

            if(diff < 0) continue;

            max_area += diff;
        }

        return max_area;
    }
}
