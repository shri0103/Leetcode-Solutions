class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            HashSet<Character> st=new HashSet<>();
            for(int j=i;j<word.length();j++){
                char c=word.charAt(j);
                if(!isvowel(c)){
                    break;
                }
                st.add(c);
                if(st.size()==5){
                    count++;
                }
                
            }      
          }
          return count;

        
       

        
    }
     boolean isvowel(char c){
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        
         }
}