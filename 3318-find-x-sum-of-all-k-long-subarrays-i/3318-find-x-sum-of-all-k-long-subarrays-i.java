class Solution {

    public static int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int[] subarray = Arrays.copyOfRange(nums, i, i + k);
            answer[i] = calculateXSum(subarray, x);
        }

        return answer;
    }

    public static int calculateXSum(int[] subarray, int x) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : subarray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : b.getValue() - a.getValue()
        );

        maxHeap.addAll(countMap.entrySet());

        int sum = 0;
        int count = 0;
        while (!maxHeap.isEmpty() && count < x) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            sum += entry.getKey() * entry.getValue();
            count++;
        }

        return sum;
    }
}