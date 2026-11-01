int min(int i,int j){
    if(i<j){
        return i;
    }
    return j;
}
int max(int i,int j){
    if(i>j){
        return i;
    }
    return j;
}
int maxArea(int* height, int heightSize) {
    int i=0,j=heightSize-1;
    int max1=0;
    while(i<j){
       int area=(j-i)*min(height[i],height[j]);
       max1=max(max1,area);
       if(height[i]<height[j]){
        i++;
       }else{
        j--;
       }
    }
    return max1;
}