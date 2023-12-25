class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].length() < 3 ) {
                words[i] = words[i].toLowerCase();
            } else {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words); 
    }
}