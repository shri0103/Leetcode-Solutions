class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int j = -1;
        if (ruleKey.equals("type"))
            j = 0;
        if (ruleKey.equals("color"))
            j = 1;
        if (ruleKey.equals("name"))
            j = 2;

        if (j >= 0) {
            for (List<String> i : items) {

                if (i.get(j).equals(ruleValue))
                {
                    count++;
                    
                }
            }
           
        }

         return count;
    }
}