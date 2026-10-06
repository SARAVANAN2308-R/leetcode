class Solution {
    public int reverseDegree(String s) {
        int pro=1;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n = 26 - (s.charAt(i) - 'a');
         
            pro=n*(i+1);
            sum+=pro;

        }
        return sum;
    }
}