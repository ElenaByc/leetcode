class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int minimumSeconds = 0;

        while(amount[1] != 0){
          amount[1]--;
          amount[2]--;
          minimumSeconds++;
          Arrays.sort(amount);
        }

        return minimumSeconds + amount[2];
    }
}