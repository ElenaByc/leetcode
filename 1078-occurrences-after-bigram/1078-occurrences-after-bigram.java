class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(first)) {
                if (i + 2 < words.length && words[i + 1].equals(second)) {
                    result.add(words[i + 2]);
                }
            }
        }
        
        String[] arr = new String[result.size()];
        arr = result.toArray(arr);
        return arr;
    }
}