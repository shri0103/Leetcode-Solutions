class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[128];
        char curr = 'a';

        for (char c : key.toCharArray()) {
            if (c != ' ' && map[c] == 0) {
                map[c] = curr++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (c == ' ') {
                ans.append(' ');
            } else {
                ans.append(map[c]);
            }
        }

        return ans.toString();
    }
}