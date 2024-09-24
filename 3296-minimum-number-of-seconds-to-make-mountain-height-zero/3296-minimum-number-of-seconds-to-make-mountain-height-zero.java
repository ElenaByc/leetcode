class Solution {
    public long minNumberOfSeconds(int h, int[] times) {
        PriorityQueue<long[]> pq =  new PriorityQueue<>(times.length, (a, b) -> Long.compare(a[3], b[3])); 

        for (int i = 0; i < times.length; ++i) {
            long[] temp = new long[4];
            temp[0] = times[i];
            temp[1] = 1;
            temp[2] = times[i];
            temp[3] = times[i];
            pq.add(temp);
        }

        long min = 0;
        while (h > 0) {
            long[] cur = pq.poll();
            ++cur[1];
            min = Math.max(min, cur[3]); 
            cur[0] = cur[2] * cur[1];   
            cur[3] += cur[0];
            pq.add(cur);
            --h;
        }


        return min;
    }
}