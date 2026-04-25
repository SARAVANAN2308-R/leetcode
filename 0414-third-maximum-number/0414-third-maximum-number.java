class Solution {
    public int thirdMax(int[] nums) {
        LinkedHashSet<Integer> set =new LinkedHashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int res[]= new int[set.size()];
        int pos=0;
        for(int i:set){
            res[pos++]=i;
        }
        return res[set.size()-1];
    }
}