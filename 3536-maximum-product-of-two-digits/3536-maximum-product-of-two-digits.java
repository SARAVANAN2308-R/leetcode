class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        int max=0;
        for(int i=0;i<list.size();i++){
            
            for(int j=i+1;j<list.size();j++){
               int pro=list.get(i)*list.get(j);
               max=Math.max(max,pro);
            }
        }
        return max;
    }
}