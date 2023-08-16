class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        String reversedStr;
        int counter = 0;
        for (String s : words) {
            reversedStr = reverse(s);
            if (reversedStr.equals(s)) continue;
            set.add(reversedStr);
            if (set.contains(s)) counter++;
        }
        return counter;
    }
    
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}