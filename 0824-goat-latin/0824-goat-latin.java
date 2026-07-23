class Solution {
    public String toGoatLatin(String sentence) {
        String s="";
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            String word=str[i];
            if(String.valueOf(word.charAt(0)).matches("[aeiouAEIOU]")){
                s+=word+"ma";
                for(int add=1;add<=i+1;add++){
                    s+="a";
                }
                s+=" ";
            }else{
                for(int j=1;j<word.length();j++){
                  s+=word.charAt(j);  
                }
                s+=word.charAt(0);
                s+="ma";
                 for(int ad=1;ad<=i+1;ad++){
                    s+="a";
                }
                s+=" ";
                
            }
        }
       return s.trim();
    }
}