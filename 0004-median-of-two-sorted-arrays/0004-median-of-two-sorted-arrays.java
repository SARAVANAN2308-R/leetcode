class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]= new int[nums1.length+nums2.length];
        int index=0;
        int count=0;
        for(int i=0;i<nums1.length;i++){
            arr[index++]=nums1[i];
            count++;
        }
         for(int i=0;i<nums2.length;i++){
            arr[index++]=nums2[i];
            count++;
        }
        Arrays.sort(arr);

        int n = arr.length;

        if(n % 2 != 0){
            return arr[n / 2];
        }

        return ((double)arr[n / 2] + arr[n / 2 - 1]) / 2;
    }
}