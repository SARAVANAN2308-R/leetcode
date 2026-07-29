class Solution {
    public int longestPalindrome(String s) {
       HashSet<Integer> Set= new HashSet<>();
       int length=0;
       for(int c:s.toCharArray()){
        if(Set.contains(c)){
            Set.remove(c);
            length+=2;
        }else{
            Set.add(c);
        }
       } 
       if(!Set.isEmpty()){
        length+=1;
       }
       return length;
    }
}