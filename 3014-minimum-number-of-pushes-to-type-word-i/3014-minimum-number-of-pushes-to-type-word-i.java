class Solution {
    public int minimumPushes(String word) {
        int count=0;
        char arr[]= word.toCharArray();
        int index=0;
    
        for(char ch:arr){
            if(index<8){
                count+=1;
            }
            else if(index<16){
                count+=2;
            }
            else if(index<24){
                count+=3;
            }else{
                count+=4;
            }
            index++;
        }
        return count;
    }
}