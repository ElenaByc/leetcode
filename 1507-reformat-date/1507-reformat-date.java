class Solution {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int n = date.length();
        int month = 0;
        String monthStr = date.substring(n-8, n-5);
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(monthStr)) {
                month = i + 1;
                break;
            }
        }
        if (month < 10) {
            monthStr = "0" + Integer.toString(month);
        } else {
            monthStr = Integer.toString(month);
        }
        String dateStr = date.substring(0, n - 11);
        if (dateStr.length() == 1) {
            dateStr = "0" + dateStr;
        }
        
        return date.substring(n - 4) + "-" + monthStr + "-" + dateStr;
    }
}