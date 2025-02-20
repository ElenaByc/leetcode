class Solution {
    public boolean hasMatch(String s, String p) {
        int j = p.indexOf('*');

        String p1 = p.substring(0, j);
        System.out.println("p1 " + p1);

        String p2 = p.substring(j+1);
        System.out.println("p2 " + p2);

        int i1 = s.indexOf(p1);
        System.out.println("i1 " + i1);
        if (i1 < 0) return false;

        int i2 = s.lastIndexOf(p2);
        System.out.println("i2 " + i2);
        if (i2 < 0) return false;

        if(i2 < i1 + p1.length()) return false;

    
        return true;
    }
}