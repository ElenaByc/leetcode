class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int key = 0;
        switch (ruleKey) {
            case "type":
                key = 0;
                break;
            case "color":
                key = 1;
                break;
            case "name":
                key = 2;
        }
        
        for (List<String> list : items) {
            if (list.get(key).equals(ruleValue)) {
                result++;
            }
        }
        
        return result;
    }
}