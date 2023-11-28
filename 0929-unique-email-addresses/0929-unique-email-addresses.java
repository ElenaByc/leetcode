class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String local;
        String domain;
        int idx;
        
        for (String email : emails) {
            // separate local name and domain name
            local = email.split("@")[0];
            domain = email.split("@")[1];
            idx = local.indexOf('+');
            if (idx != - 1) {
                local = local.substring(0, idx);
            }
            // remove dots
            idx = local.indexOf('.');
            if (idx != - 1) {
                local = local.replace(".", "");
            }
            set.add(local + "@" + domain);
        }

        return set.size();
    }
}