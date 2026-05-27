class Solution {
    public int pivotInteger(int n) {
        
        for(int i=1;i<=n;i++){
            int left=0;
        int right=0;
       for(int t=1;t<=i;t++){
        left+=t;
       }
       for(int t=i;t<=n;t++){
         right+=t;
       }
       if(left==right){
         return i;
       }
     
    }
       
        return -1;
        
    }
}