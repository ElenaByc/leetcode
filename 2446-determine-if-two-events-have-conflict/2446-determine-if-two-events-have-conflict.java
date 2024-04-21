class Solution {
    public boolean haveConflict(String[] ev1, String[] ev2) {
        int h = Integer.parseInt(ev1[0].substring(0,2));
        int m = Integer.parseInt(ev1[0].substring(3,5));
        int s1 = h * 60 + m;
        h = Integer.parseInt(ev1[1].substring(0,2));
        m = Integer.parseInt(ev1[1].substring(3,5));
        int e1 = h * 60 + m;
        
        h = Integer.parseInt(ev2[0].substring(0,2));
        m = Integer.parseInt(ev2[0].substring(3,5));
        int s2 = h * 60 + m;
        h = Integer.parseInt(ev2[1].substring(0,2));
        m = Integer.parseInt(ev2[1].substring(3,5));
        int e2 = h * 60 + m;
            
        return !(e1 < s2 || e2 < s1);
    }
}