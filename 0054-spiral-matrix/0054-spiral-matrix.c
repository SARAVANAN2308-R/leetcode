/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int *arr = malloc(matrixSize * matrixColSize[0] * sizeof(int));
    int top = 0, left = 0;
    int bottom = matrixSize - 1;
    int right = matrixColSize[0] - 1;
    int index = 0;
    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            arr[index++]=matrix[top][i];
        }
        top++;
         for(int i=top;i<=bottom;i++){
            arr[index++]=matrix[i][right];
        }
        right--;
        if(top<=bottom){
         for(int i=right;i>=left;i--){
            arr[index++]=matrix[bottom][i];
        }
        bottom--;
        }
        if(left<=right){
         for(int i=bottom;i>=top;i--){
            arr[index++]=matrix[i][left];
        }
        left++;
        }
    }
    *returnSize = index;
    return arr;
}