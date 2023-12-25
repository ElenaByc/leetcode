class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] arr = title.split(" ");
        for (String s : arr)
        {
            if (s.length() <= 2 ) {
                sb.append(s.toLowerCase() + " ");
            }else {
                sb.append(s.substring(0, 1).toUpperCase());
                sb.append(s.substring(1).toLowerCase() + " ");
            }
        }
        return sb.toString().trim();
    }
}