class Solution {
    public int minSensors(int n, int m, int k) {
        int s=2*k+1;
        double cl=Math.ceil((double)n/s)*Math.ceil((double)m/s);
        return (int)cl;
        
    }
}