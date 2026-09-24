class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            int sum=0;

            while(value>0){
                int digit=value%10;
                sum+=digit;
                value/=10;
            }
            if(sum==i){
               min=Math.min(min,i);
            }
        }
        return min>1000?-1:min;
    }
}