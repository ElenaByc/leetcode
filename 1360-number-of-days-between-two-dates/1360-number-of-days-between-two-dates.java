import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate start = LocalDate.parse(date1);
        LocalDate end   = LocalDate.parse(date2);

        long diffInDays = ChronoUnit.DAYS.between(start, end);
        
        return Math.abs((int)diffInDays);
    }
}