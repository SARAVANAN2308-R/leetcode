class Solution {
    public int climbStairs(int n) {
        int a = 1,b=2;
        if(n==1){
            return 1;
        }
       if(n==2){
        return 2;
       }

       for(int i=3;i<=n;i++){
        int temp=a+b;
        a=b;
        b=temp;
       }
       return b;
    }
}