class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        if (n == 2) {
            return 2;
        }
        
        int even = 0;
        int odd = 0;
        
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        if (even == n) {
            return even;
        }
        if (odd == n) {
            return odd;
        }
        
        int len = Math.max(even, odd);
        
        // first num even
        // second num odd 
        int lenEO = 0;
        int i = 0;
        while (i < n && nums[i] % 2 != 0) {
            i++;
        }
        if (i < n) {
            int n0 = nums[i];
            i++;
            while (i < n && nums[i] % 2 != 1) {
                i++;
            } 
            if (i < n) {
                int n1 = nums[i];
                i++;
                // System.out.println("n0 = " + n0);
                // System.out.println("n1 = " + n1);
                lenEO = 2;
                while (i < n) {
                    while (i < n && nums[i] % 2 != n0 % 2) {
                        i++;
                    }
                    if (i < n) {
                        lenEO++;
                        i++;
                        while (i < n && nums[i] % 2 != (n1 % 2)) {
                            i++;
                        }
                        if (i < n) {
                            lenEO++;
                            i++;
                        }
                    }
                }
            }
        }
        // System.out.println("lenEO = " + lenEO);
        len = Math.max(len, lenEO);
        // first num odd
        // second num even
        int lenOE = 0;
        i = 0;
        while (i < n && nums[i] % 2 != 1) {
            i++;
        }
        if (i < n) {
            int n0 = nums[i];
            i++;
            while ( i < n && nums[i] % 2 != 0) {
                i++;
            } 
            if (i < n) {
                int n1 = nums[i];
                i++;
                // System.out.println("n0 = " + n0);
                // System.out.println("n1 = " + n1);
                lenOE = 2;
                while (i < n) {
                    while (i < n && nums[i] % 2 != n0 % 2) {
                        i++;
                    }
                    if (i < n) {
                        lenOE++;
                        i++;
                        while (i < n && nums[i] % 2 != (n1 % 2)) {
                            i++;
                        }
                        if (i < n) {
                            lenOE++;
                            i++;
                        }
                    }
                }
            }
        }
        // System.out.println("lenOE = " + lenOE);
        len = Math.max(len, lenOE);   
        
        return len;
    }
}