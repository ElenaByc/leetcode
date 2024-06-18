class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        long sum = 0;
        for (int n : arr) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        
        // System.out.println(sum);
        
        sum /= 3;
        
        // System.out.println(sum);
        
        int n = arr.length;
        int l = 1;
        int r = n - 2;
        long sumL = arr[0];
        long sumR = arr[n - 1];
        
        while (l < n && sumL != sum) {
            sumL += arr[l];
            l++;
        }
        // System.out.println("l = " + l);
        if (l > n - 2) {
            return false;
        }
        
        while (r > 0 && sumR != sum) {
            sumR += arr[r];
            r--;
        }
        // System.out.println("r = " + r);
        if (r < 1 || r - l < 0) {
            return false;
        }
        
        return true;
    }
}