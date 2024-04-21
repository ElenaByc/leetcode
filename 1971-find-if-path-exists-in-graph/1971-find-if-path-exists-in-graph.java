class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        if (s == d) {
            return true;
        }
        int[] components = new int[n];
        var hm = new HashMap<Integer, LinkedList<Integer>>();
        LinkedList list;
        
        for (int[] e : edges) {
            if (hm.containsKey(e[0])) {
                list = hm.get(e[0]);
            } else {
                list = new LinkedList<>();
            }
            list.add(e[1]);
            hm.put(e[0], list);
            if (hm.containsKey(e[1])) {
                list = hm.get(e[1]);
            } else {
                list = new LinkedList<>();
            }
            list.add(e[0]);
            hm.put(e[1], list);
        }
        
        if (!hm.containsKey(s) || !hm.containsKey(d)) {
            return false;
        }
        
        // System.out.println(hm);
        int v;
        int componentCnt = 1;
        for (int i : hm.keySet()) {
            // System.out.println("i = " + i);
            // System.out.println(Arrays.toString(components));
            if (components[i] == 0) {
                components[i] = componentCnt;
                v = i;
                list = hm.get(v);
                while (!list.isEmpty()) {
                    v = (int)list.poll();
                    components[v] = componentCnt;
                    for (int v1 : hm.get(v)) {
                        if (components[v1] == 0) {
                            list.add(v1);
                        }
                    }
                }
                componentCnt++;
            }
            // System.out.println(Arrays.toString(components));
        }
        
        return components[s] == components[d];
    }
    
    
}