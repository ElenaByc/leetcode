class Solution {
    public String toGoatLatin(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder result =  new StringBuilder();
        StringBuilder ending = new StringBuilder();
        ending.append("maa");
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < array.length; i++) {
            if(vowels.indexOf(array[i].charAt(0)) != -1) { //vowel
                result.append(array[i]);
            } else {
                result.append(array[i].substring(1) + array[i].charAt(0));
            }
            result.append(ending);
            if (i < array.length - 1) {
                result.append(" ");
            }
            ending.append('a');
        }

        return result.toString();
    }
}