class Solution {
    public double calculateTax(int[][] brackets, int income) {

        if (income <= brackets[0][0]) {
            return income * brackets[0][1] / 100.0;
        }
        int n = brackets.length;
        double tax =  brackets[0][0] * brackets[0][1] / 100.0;
        
        for (int i = 1; i < n; i++) {
            if (income > brackets[i][0]) {
                tax += (brackets[i][0] - brackets[i - 1][0]) * brackets[i][1] / 100.0;
            } else { // income <= brackets[i][0]
                tax += (income - brackets[i - 1][0]) * brackets[i][1] / 100.0;
                break;
            }   
        }
        
        return tax;
    }
}