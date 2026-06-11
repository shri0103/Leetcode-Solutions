class Solution {
    public List<String> validStrings(int n) {
        char[] curr = new char[n];
        Arrays.fill(curr, '1');
        List<String> list = new ArrayList<>();
        solve(n, list, curr, 0);
        return list;
    }

    void solve(int n, List<String> list, char[] curr, int start) {
        list.add(new String(curr));
        if (start >= n) {
            return;
        }

        for (int i = start; i < n; i++) {
            curr[i] = '0';
            solve(n, list, curr, i + 2);
            curr[i] = '1';
        }
    }
}