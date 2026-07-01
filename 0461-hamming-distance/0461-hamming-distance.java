class Solution {



    public int hammingDistance(int x, int y) {
        
     
        int z = x ^ y;

        int sol = 0;
        while(z > 0){
            if(z % 2 == 1)
                sol += 1;
            z /= 2;
        }

        return sol;    
    }
}