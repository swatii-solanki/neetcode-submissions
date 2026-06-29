class NumArray {

    List<Integer> list = new ArrayList();

    public NumArray(int[] nums) {
        int n = nums.length;

        list.add(nums[0]);

        for(int i = 1; i < n; i++) {
            int sum = list.get(i-1) + nums[i];
            list.add(sum);
        }
    }
    
    public int sumRange(int left, int right) {

        int sum = 0;
        
        if(left == 0) {
            sum = list.get(right);
        } else {
            sum = list.get(right) - list.get(left-1);
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */