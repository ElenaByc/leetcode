class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String local;
        String domain;
        StringBuilder sb = new StringBuilder();
        char ch;
        
        for (String email : emails) {
            // separate local name and domain name
            local = email.split("@")[0];
            domain = email.split("@")[1];
            for (int i = 0; i < local.length(); i++) {
                ch = local.charAt(i);
                if (ch == '.') continue;
                if (ch == '+') break;
                sb.append(ch);
            }
            sb.append('@');
            sb.append(domain);
            set.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return set.size();
    }
}