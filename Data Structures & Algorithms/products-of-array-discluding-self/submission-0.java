class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left_product = new int[n];
        int[] right_product = new int[n];
        int[] ans = new int[n];

        left_product[0] = nums[0];
        right_product[n-1] = nums[n-1];

        for(int i = 1; i < n; i++) {
            left_product[i] = left_product[i-1] * nums[i];
        }

        for(int i = n-2; i >= 0; i--) {
            right_product[i] = right_product[i+1] * nums[i];
        }

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                ans[i] = right_product[i+1];
            } else if(i == n-1) {
                ans[i] = left_product[i-1];
            } else {
                ans[i] = left_product[i-1] * right_product[i+1];
                System.out.print(ans[i] + " ");
            }
        }

        return ans;
    }
}  
