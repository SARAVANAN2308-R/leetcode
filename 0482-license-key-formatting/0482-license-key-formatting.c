char* licenseKeyFormatting(char* s, int k) {
    char *arr=malloc(strlen(s)+1*sizeof(char));
    int idx=0;
    for(int i=0;i<strlen(s);i++){
        if(s[i]!='-'){
        arr[idx++]=toupper(s[i]);
        }
    }
    arr[idx] = '\0';
    char *arr1 = malloc((idx + idx / k + 2) * sizeof(char));
    int index=0;
    int count=0;
    for(int i=idx-1;i>=0;i--){
        if(count==k){
            arr1[index++]='-';
            count=0;
        }
       arr1[index++]=arr[i];
       count++;
    }
     arr1[index] = '\0';
    for(int i = 0; i < index / 2; i++) {
        char temp = arr1[i];
        arr1[i] = arr1[index - i - 1];
        arr1[index - i - 1] = temp;
    }

    return arr1;
}