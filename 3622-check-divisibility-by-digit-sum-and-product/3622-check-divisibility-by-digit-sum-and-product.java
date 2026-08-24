class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            pro*=digit;
            temp/=10;
        }
        if(n%(sum+pro)==0){
            return true;
        }else{
            return false;
        }
    }
}