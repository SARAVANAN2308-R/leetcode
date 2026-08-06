class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=min;i<=max;i++){
                list.add(i);
        }
        int index=0;
        for(int value:list){
             if (index < nums.length && nums[index] == value) {
        index++;
    } else {
        list2.add(value);
    }
        }
        return list2;
    }
}