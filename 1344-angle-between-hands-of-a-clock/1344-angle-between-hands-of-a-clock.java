class Solution {
    public double angleClock(int hour, int minutes) {
        double mintueangle=minutes*6;
        double hourangle=(hour%12)*30+minutes*0.5;
        double angle=Math.abs(mintueangle-hourangle);
        angle=Math.min(angle,360-angle);
        return angle;
        
    }
}