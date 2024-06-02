class Solution {
    public int countDays(int d, int[][] meetings) {
        int cnt = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = meetings.length;
        int[] arr = new int[n];
        int i = 0;
        for (var m : meetings) {
            hm.put(m[0], Math.max(hm.getOrDefault(m[0], 0), m[1]));
            arr[i] = m[0];
            i++;
        }
        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        for (int a : arr) {
            int b  = hm.get(a);
            if (list.isEmpty()) {
                list.add(new int[] {a, b});
            } else {
                var prev = list.get(list.size() - 1);
                if (prev[1] < a) {
                    list.add(new int[] {a, b});
                } else if (prev[1] == a) {
                    list.remove(list.size() - 1);
                    list.add(new int[] {prev[0], b});
                } else {
                    list.remove(list.size() - 1);
                    list.add(new int[] {prev[0], Math.max(prev[1], b)});
                }
            }
        }

        // for(var l : list) {
        //     System.out.println(Arrays.toString(l));
        // }
        
        if (list.get(0)[0] > 1) {
            cnt += list.get(0)[0] - 1;
        }
        
        n = list.size();
        if (list.get(n - 1)[1] < d) {
            cnt += d - list.get(n - 1)[1];
        }
        int prev = list.get(0)[1];
        for (i = 1; i < n; i ++) {
            cnt += (list.get(i)[0] - prev - 1);
            prev = list.get(i)[1];
        }


        
        

        return cnt;
    }
}