class Solution {
    public int countSymmetricIntegers(int low, int high) {  int cnt=0;
      for(int i=low;i<=high;i++){
        
      
        
        if(i>=10&&i<=99){
            int first=i/10;
            int last=i%10;
            if(first==last){
                cnt++;
            }

        }else if(i>=1000&&i<=9999){
            
            int first = i / 1000 + (i / 100) % 10;
         int last = (i / 10) % 10 + i % 10;
         if(first==last){ 
         cnt++;}
        }
    
      }return cnt;
    }
}