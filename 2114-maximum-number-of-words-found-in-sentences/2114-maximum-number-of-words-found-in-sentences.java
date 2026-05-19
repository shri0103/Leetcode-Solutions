class Solution {
    public int mostWordsFound(String[] sentences) {
        // int maxLimit = Integer.MAX_VALUE; 
        int larger=0;
        for(String s:sentences){
            int count=s.split(" ").length;
              System.out.println("\"" + s + "\" = " + count);
            
             larger=Math.max(larger,count);
        }return larger;
        
    }
}