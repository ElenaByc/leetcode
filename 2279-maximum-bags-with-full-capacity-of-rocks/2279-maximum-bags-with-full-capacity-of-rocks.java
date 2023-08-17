class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int numOfFullBags = 0;
        int freeSpaces = 0;

        for (int i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
            freeSpaces += capacity[i];
        }

        // if (freeSpaces <= additionalRocks) {
        //     return capacity.length;
        // }

//         System.out.println(Arrays.toString(capacity));
//         System.out.println(freeSpaces);

        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for (int num : capacity) { // O(n)
        //     hm.put(num, hm.getOrDefault(num, 0) + 1);
        // }
        // System.out.println(hm);
        // for (int i = 0; i <= additionalRocks; i++) {
        //     if (hm.containsKey(i)) {
        //         if (i == 0) {
        //             numOfFullBags += hm.get(0);
        //         } else if (i * hm.get(i) <= additionalRocks) {
        //             additionalRocks -= i * hm.get(i);
        //             numOfFullBags += hm.get(i);
        //         } else {
        //             numOfFullBags += additionalRocks / i;
        //             break;
        //         }
        //     }
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