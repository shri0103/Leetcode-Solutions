class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int sol = 0;
        for(String x : patterns)
            sol += (word.contains(x)) ? 1 : 0;

        return sol;
    }
}