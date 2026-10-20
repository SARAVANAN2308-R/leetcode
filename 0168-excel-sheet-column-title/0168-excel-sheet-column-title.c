char* convertToTitle(int columnNumber) {
    char *str=malloc(20*sizeof(char));
    int index=0;
    
    while(columnNumber>0){
        columnNumber--;
        int digit=columnNumber%26;
        str[index++]='A'+digit;
        columnNumber/=26;
    }
    str[index]='\0';
    int i=0,j=index-1;
    while(i<j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
        i++;
        j--;
    }
    return str;
}