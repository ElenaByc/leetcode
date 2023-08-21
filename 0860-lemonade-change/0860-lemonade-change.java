class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bills5 = 0;
        int bills10 = 0;
        
        for (int bill: bills) {
            switch (bill) {
                case 5:
                    bills5++;
                    break;
                case 10:
                    if (bills5 == 0) {
                        return false;
                    }
                    bills5--;
                    bills10++;
                    break;
                case 20:
                    if (bills10 > 0 && bills5 > 0) {
                        bills10--;
                        bills5--;
                    } else if (bills5 > 2) {
                        bills5 -= 3;
                    } else {
                        return false;
                    }
            }
        }
        return true;
    }
}