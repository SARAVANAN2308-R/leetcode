class Solution {
    public int smallestNumber(int n, int t) {
        int val=0;
        for(int i=n;i<=100;i++){
            int pro=1;
            int temp=i;
            while(temp!=0){
              int digit=temp%10;
              pro*=digit;
              temp/=10;
            }
            if(pro%t==0){
                val=i;
                break;
            }
          }
          return val;   
        }
}