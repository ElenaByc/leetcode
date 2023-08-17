class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int numOfFullBags = 0;
        // int freeSpaces = 0;

        for (int i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
            // freeSpaces += capacity[i];
        }

        // if (freeSpaces <= additionalRocks) {
        //     return capacity.length;
        // }


        Arrays.sort(capacity);
        for (int num: capacity) {
          if (num <= additionalRocks) {
            numOfFullBags++;
            additionalRocks -= num;
          } else {
            break;
          }
        }
        return numOfFullBags;
    }
}