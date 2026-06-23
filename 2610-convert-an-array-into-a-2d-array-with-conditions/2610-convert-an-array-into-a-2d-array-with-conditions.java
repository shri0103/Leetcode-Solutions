class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        Map<Integer,Integer> freq = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int num : nums) {
            int count = freq.getOrDefault(num, 0);

            if(count == ans.size()) {
                ans.add(new ArrayList<>());
            }

            ans.get(count).add(num);
            freq.put(num, count + 1);
        }

        return ans;
    }
}