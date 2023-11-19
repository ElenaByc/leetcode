class Solution {
    public long minimumSteps(String s) {
    
        long steps = 0;
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left < n && s.charAt(left) == '0') {
            left++;
        }
        if (left == n) return 0;
        while (right >= 0 && s.charAt(right) == '1') {
            right--;
        }
        
        // System.out.println("left = " + left);
        // System.out.println("right = " + right);
        if (right < left) return 0;
        
        if (left + 1 == right) return 1;
        
        if (right - left == 2) {
            return 2;
        }
    
        
        // count '1'
        int i = 0;
        while (left + i <= right) {
            while (left + i < right && s.charAt(left + i) == '1') {
                i++;
            }
             // System.out.println("left = " + left);
             // System.out.println("i = " + i);
            steps += i;
            if (left + i == right) {
                return steps;
            }
            left++;
        }
        return steps;
        
    }
}