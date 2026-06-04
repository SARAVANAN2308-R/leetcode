class Solution {
    public int longestSubarray(int[] arr) {
        int ws=0;
        int replace=0;
        int max=0;
        for(int we=0;we<arr.length;we++){
            if(arr[we]==0){
                replace++;
            }
            while(replace>1){
                if(arr[ws]==0){
                    replace--;
                }
                ws++;
            }
            max=Math.max(max,we-ws);
        }
        return max;
    }
}