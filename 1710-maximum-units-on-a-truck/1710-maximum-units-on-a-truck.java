class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maxUnits = 0;
        int boxNumber = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int boxes = 0;

        for (int[] boxType : boxTypes) {
            hm.put(boxType[1], hm.getOrDefault(boxType[1], 0) + boxType[0]);
        }

        int[] units = new int[hm.size()];
        int i = 0;
        for (int key : hm.keySet()) {
            units[i] = key;
            i++;
        }

        Arrays.sort(units);
        
        for (i = units.length - 1; i >= 0 && boxNumber <= truckSize; i--) {
            boxes = hm.get(units[i]);
            if (boxes + boxNumber <= truckSize) {
                maxUnits += units[i] * boxes;
                boxNumber += boxes;
            } else {
                maxUnits += units[i] * (truckSize - boxNumber);
                boxNumber = truckSize;
            }
        }

        return maxUnits;
    }
}