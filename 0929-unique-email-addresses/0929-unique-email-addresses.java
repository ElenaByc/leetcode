class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] arr;
        char ch;
        
        for (String email : emails) {
            // separate local name and domain name
            arr = email.split("@");
            for (int i = 0; i < arr[0].length(); i++) {
                ch = arr[0].charAt(i);
                if (ch == '.') continue;
                if (ch == '+') break;
                sb.append(ch);
            }
            sb.append('@');
            sb.append(arr[1]);
            set.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return set.size();
    }
}