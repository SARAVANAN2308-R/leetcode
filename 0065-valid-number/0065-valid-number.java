class Solution {
    public boolean isNumber(String s) {
        boolean dotseen=false;
        boolean eseen=false;
        boolean digitseen=false;
        boolean digitae=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                digitseen=true;
               
            }else if(ch=='+' ||ch=='-'){
                   if(i!=0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E'){
                    return false;
                   }
            }else if(ch=='.'){
                if(dotseen||eseen){
                    return false;
                }
                dotseen=true;
            }else if(ch=='e' || ch=='E'){
                if(eseen||!digitseen){
                    return false;
                }
                eseen=true;
                digitseen=false;
            }else{
                return false;
            }
        }
        return digitseen;
    }
}