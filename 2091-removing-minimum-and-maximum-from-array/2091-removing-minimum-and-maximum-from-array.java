class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxindex=0;
        int min=Integer.MAX_VALUE;
        int minindex=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>max){
            max=nums[i];
            maxindex=i;
           }
           if(nums[i]<min){
            min=nums[i];
            minindex=i;
           }
        }
        int n = nums.length;
        int left = Math.max(minindex, maxindex) + 1;
        int right = n - Math.min(minindex, maxindex);
        int both = Math.min(minindex, maxindex) + 1 + n - Math.max(minindex, maxindex);
        return Math.min(left, Math.min(right, both));

    }
}