class Solution {
    public String reverseWords(String s) {
        String[] wd=s.split(" ");
        StringBuilder e=new StringBuilder();
        for(String d:wd){
             String rev=new StringBuilder(d).reverse().toString();
             e.append(rev).append(" ");
        }
        return e.toString().trim();
        
    }
}