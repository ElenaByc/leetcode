class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Set<Integer> primes = new HashSet<>();
        // primes.add(2);
        // primes.add(3);
        // primes.add(5);
        // primes.add(7);
        // primes.add(11);
        // primes.add(13);
        // primes.add(17);
        // primes.add(19);
        
        int result = 0;
        
        for (int i = left; i <= right; i++) {
            // if (primes.contains(Integer.bitCount(i))) {
            if (isSmallPrime(Integer.bitCount(i))) {
                result++;
            }
        }
        
        return result;
    }
    
    public boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }
    
    public int countOnes(int num) {
        int ones = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                ones++;
            }
            num /= 2;
        }
        return ones;
    }
}