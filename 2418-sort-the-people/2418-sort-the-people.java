import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        TreeMap<Integer, String> people = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < names.length; i++) {
            people.put(heights[i], names[i]);
        }

        String[] result = new String[names.length];
        int index = 0;

        for (String name : people.values()) {
            result[index++] = name;
        }

        return result;
    }
}