class Solution {
    public String clearStars(String s) {
        List<List<Integer>> letters = new ArrayList<>();
        List<Integer> list;

        for (int i = 0; i < 26; i++) {
            list = new ArrayList<>();
            letters.add(list);
        }

        StringBuilder sb = new StringBuilder();
        int lastSmallestIdx = -1;
        char ch;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != '*') {
                list = letters.get((int)(ch - 'a'));
                list.add(i);
                letters.set((int)(ch - 'a'), list);
                sb.append(ch);
            } else {
                // remove lastSmallestChar
                for (int j = 0; j < 26; j++) {
                    list = letters.get(j);
                    // System.out.println(" j = " + j);
                    // System.out.println("list: " + list);
                    if (list.size() > 0) {
                        lastSmallestIdx = list.get(list.size() - 1);
                        // System.out.println("lastSmallestIdx =" + lastSmallestIdx);
                        list.remove(list.size() - 1);
                        letters.set(j, list);
                        break;
                    }
                    
                }
                sb.setCharAt(lastSmallestIdx, '*');
                sb.append(ch);
                cnt++;
            }
        }
        // System.out.println();
        if (cnt == 0) {
            return s;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            ch = sb.charAt(i);
            if (ch != '*') {
                sb2.append(ch);
            }
        }
        return sb2.toString();
    }
}