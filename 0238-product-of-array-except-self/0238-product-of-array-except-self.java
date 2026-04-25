class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=1;
        }
        int prefix_mul = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = res[i]*prefix_mul;
            prefix_mul = prefix_mul * nums[i];
        }
        int sufix_mul =1;
        for(int i=nums.length-1 ; i>=0 ;i--){
            res[i]= res[i]*sufix_mul;
            sufix_mul = sufix_mul*nums[i];
        }
        return res;
    }
}