class Solution {
    public String removeDuplicateLetters(String s) {
        List<Character> list = new ArrayList<>();
        char ch;
        boolean[] taken = new boolean[26];
        int[] dict = new int[26];

        // count letters
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a']++;
        }
        
        System.out.println(Arrays.toString(dict));

        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            dict[ch - 'a']--;
            if(taken[ch - 'a']) continue;
            while (list.size() > 0 && 
                   list.get(list.size() - 1) > ch && 
                   dict[list.get(list.size() - 1) - 'a'] > 0 ) {
                taken[list.get(list.size() - 1) - 'a'] = false;
                list.remove(list.size() - 1);
            }
            list.add(s.charAt(i));
            taken[s.charAt(i) - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}