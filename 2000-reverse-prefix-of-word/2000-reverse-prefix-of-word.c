char* reversePrefix(char* word, char ch) {
    int index=0;
    char str[256];
    for(int i=0;i<strlen(word);i++){
        if(word[i]==ch){
            str[index++]=word[i];
            break;
        }else{
            str[index++]=word[i];
        }
    }
    str[index]='\0';
     if (index == 0 || str[index - 1] != ch) {
        return word;
    }
    int i=index-1;
    int newin=0;
    while(i>=0){
       word[newin++]=str[i--];
       
    }
    return word;
}