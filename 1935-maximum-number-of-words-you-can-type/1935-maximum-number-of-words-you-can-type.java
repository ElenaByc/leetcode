class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int counter = 0;
        boolean canType;
        
        for (String word : words) {
            canType = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.indexOf(brokenLetters.charAt(i)) != -1) {
                    canType = false;
                    break;
                }
            } 
            if (canType) {
                counter++;
            }
        }
        
        return counter;
    }
}