class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        char chL;
        char chR;
        char[] arr = new char[n];
        
        while (left <= right) {
            chL = s.charAt(left);
            chR = s.charAt(right);
            while (!((chL >= 'a' && chL <= 'z')||(chL >= 'A' && chL <= 'Z')) && left < right) {
                arr[left] = chL;
                left++;
                chL = s.charAt(left);
            }
            // System.out.println("left: " + Arrays.toString(arr));
            while (!((chR >= 'a' && chR <= 'z')||(chR >= 'A' && chR <= 'Z')) && left < right) {
                arr[right] = chR;
                right--;
                chR = s.charAt(right);
            }
            // System.out.println("right: " + Arrays.toString(arr));
            if (left <= right) {
                arr[right] = chL;
                arr[left] = chR;
                left++;
                right--;
            }
            //  System.out.println("swap: " + Arrays.toString(arr));
        }
        
        return new String(arr);
    }
}