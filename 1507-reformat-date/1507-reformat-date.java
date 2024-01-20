class Solution {
    public String reformatDate(String date) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Jan", "01");
        hm.put("Feb", "02");
        hm.put("Mar", "03");
        hm.put("Apr", "04");
        hm.put("May", "05");
        hm.put("Jun", "06");
        hm.put("Jul", "07");
        hm.put("Aug", "08");
        hm.put("Sep", "09");
        hm.put("Oct", "10");
        hm.put("Nov", "11");
        hm.put("Dec", "12");
        
        int n = date.length();
        String dateStr;
        if (n == 13) {
            dateStr = date.substring(0, 2);
        } else {
             dateStr = "0" + date.substring(0, 1);
        }
        
        return date.substring(n - 4) + "-" + hm.get(date.substring(n-8, n-5)) + "-" + dateStr;
    }
}