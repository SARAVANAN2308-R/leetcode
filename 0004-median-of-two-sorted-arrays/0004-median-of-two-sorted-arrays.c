int compare(const void *a,const void *b){
    return (*(int*)a-*(int*)b);
}
double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int arr[nums1Size+nums2Size];
    int n=nums1Size+nums2Size;
    int index=0;
    for(int i=0;i<nums1Size;i++){
       arr[index++]=nums1[i];
    }
     for(int i=0;i<nums2Size;i++){
       arr[index++]=nums2[i];
    }
    qsort(arr,n,sizeof(int),compare);
    if(n%2!=0){
        return arr[n/2];
    }
    return ((double)arr[n / 2] + arr[n / 2 - 1]) / 2.0;

}