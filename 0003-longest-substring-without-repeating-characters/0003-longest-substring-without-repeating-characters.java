class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]= new int[256];
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            arr[s.charAt(right)]++;
            while(arr[s.charAt(right)]>1){
                arr[s.charAt(left)]--;
                 left++;
            }
           
            max=Math.max(max,right-left+1);
        }
        
        return max;
    }
}