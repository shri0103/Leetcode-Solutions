class Solution {
    public String convert(String s, int numRows) {

         if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        List<String> arr = new ArrayList<>();
        for(int i=0;i<numRows;i++)
            arr.add(new String());

        int row = 0;
        int inc = 1;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr.set(row,arr.get(row) + c);
            row += inc;
            if(row == numRows){
                inc = -1;
                row -= 2;
            }
            if(row < 0){
                inc = 1;
                row += 2;
            }
        }

        String ans = "";
        for(String t : arr) 
            ans += t;

        return ans;
    }
}