class Solution {
    public int minNumberOfHours(int e0, int exp0, int[] e, int[] exp) {
        int n = e.length;
        int currE = e0;
        int currExp = exp0;
        int hours = 0;
        
        for (int i = 0; i < n; i++) {
            if (currE <= e[i]) {
                hours += e[i] - currE + 1;
                currE = e[i] + 1;
            }
            if (currExp <= exp[i]) {
                hours += exp[i] - currExp + 1;
                currExp = exp[i] + 1;
            }
            currE -= e[i];
            currExp += exp[i];
        }
        
        
        return hours;
    }
}