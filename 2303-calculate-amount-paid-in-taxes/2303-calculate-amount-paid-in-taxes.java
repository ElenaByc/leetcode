class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int n = brackets.length;
        
        for (int i = 0; i < n; i++) {
            if (income >= brackets[i][0]) {
                if (i > 0) {
                    tax += (brackets[i][0] - brackets[i - 1][0]) * brackets[i][1] / 100.0;
                } else {
                    tax += (brackets[i][0]) * brackets[i][1] / 100.0;
                }
            } else { // income < brackets[i][0]
                if (i > 0) {
                    tax += (income - brackets[i - 1][0]) * brackets[i][1] / 100.0;
                } else {
                    tax += income * brackets[i][1] / 100.0;
                }
                break;
            }
            
        }
        
        return tax;
    }
}