class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch:text.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);

        }
        int b=mp.getOrDefault('b',0);
        int a=mp.getOrDefault('a',0);
        int l=mp.getOrDefault('l',0);
        int o=mp.getOrDefault('o',0);
        int n=mp.getOrDefault('n',0);
        // int min=Integer.MAX_VALUE;
        // for(int fre:mp.values()){
        //     min=Math.min(min,fre);
        // }
       int ans=Math.min(Math.min(b,a),Math.min(l/2,Math.min(o/2,n)));
        return ans;
       
        
    }
}