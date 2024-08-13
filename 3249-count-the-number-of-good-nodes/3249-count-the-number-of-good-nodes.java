class Solution {
    public int countGoodNodes(int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ArrayList<Integer> list;
        int n = edges.length;
        int[] arr = new int[n + 1];
        int cnt = 0;
        
        for (int[] e : edges) {
            if (hm.containsKey(e[0])) {
                list = hm.get(e[0]);
            } else {
                list = new ArrayList<>();
            }
            list.add(e[1]);
            hm.put(e[0], list);
            if (hm.containsKey(e[1])) {
                list = hm.get(e[1]);
            } else {
                list = new ArrayList<>();
            }
            list.add(e[0]);
            hm.put(e[1], list);
            
        }
        
        // System.out.println(hm);
        ArrayList<ArrayList<Integer>> levels = new ArrayList<>();
        list = new ArrayList<>();
        list.add(0);
        levels.add(list);
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        ArrayList<Integer> curr;
        ArrayList<Integer> newLevel;
        while (set.size() < n + 1) {
            newLevel = new ArrayList<>();
            curr = levels.getLast();
            for (int i : curr) {
                list = hm.get(i);
                for (int j : list) {
                    if (!set.contains(j)) {
                        set.add(j);
                        newLevel.add(j);
                    }
                }
            }
            levels.add(newLevel);
            // System.out.println("level: " + newLevel);
        }
        
        // System.out.println("Number of levels " + levels.size());
        set = new HashSet<>();
        for (int i = levels.size() - 1; i >= 0; i--) {
            curr = levels.get(i);
            if (i == levels.size() - 1) {
                for (int j : curr) {
                    set.add(j);
                    cnt++;
                }
            } else {
                
                for (int j : curr) {
                    list = hm.get(j);
                    if (list.size() == 1) {
                        cnt++;
                        set.add(j);
                        continue;
                    }
                    int val = -1;
                    int sum = 0;
                    boolean isGood = true;
                    for (int k : list) {
                        if (set.contains(k)) {
                            if (val == -1) {
                                val = arr[k];
                            } else {
                                if (val != arr[k]) {
                                    isGood = false;
                                }
                            }
                            sum += arr[k] + 1;
                            
                        }
                    }
                    arr[j] = sum;
                    set.add(j);
                    if(isGood) {
                        cnt++;
                    }
                    // System.out.println("j = " + j + "cnt = " + cnt);
                }
            }
        }
        
         // System.out.println(Arrays.toString(arr));
        
        return cnt;
    }
}