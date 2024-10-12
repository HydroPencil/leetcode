class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];

        for(int i=0; i<len; i++){
            int sum =0;
            for(int j = 0; j<=i; j++){
                sum += nums[j];
            }
            ans[i] = sum;
        }

        return ans;
    }
}