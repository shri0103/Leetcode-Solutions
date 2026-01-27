class Solution {
    public String convertDateToBinary(String date) {

        String[] result = date.split("-");

        String yearBinary = Integer.toBinaryString(Integer.parseInt(result[0]));
        String monthBinary = Integer.toBinaryString(Integer.parseInt(result[1]));
        String dayBinary = Integer.toBinaryString(Integer.parseInt(result[2]));

        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }
}
