class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int[] ans=new int[nums.length];
        int leftSum = 0;
        for (int i=0;i< nums.length;i++) {
            int rightSum = totalSum-leftSum-nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}