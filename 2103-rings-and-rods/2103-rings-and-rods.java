class Solution {
    public int countPoints(String rings) {
        int n = rings.length() / 2;
        if (n < 3) return 0;
        int counter = 0;
        boolean[][] rods = new boolean[10][3];
        char ch;
        int num;
    
        for (int i = 0; i < 2 * n; i += 2) {
            ch = rings.charAt(i);
            num = Character.getNumericValue(rings.charAt(i + 1));
            // System.out.println("ch = " + ch + " num = " + num);
            switch (ch) {
                case 'R':
                    rods[num][0] = true;
                    break;
                case 'G':
                    rods[num][1] = true;
                    break;
                case 'B':
                    rods[num][2] = true;
                    break;
            } 
        }
        // System.out.println(Arrays.deepToString(rods));
        for (boolean[] rod : rods) {
            if (rod[0] && rod[1] && rod[2]) {
                counter++;
            }
        }
        return counter;
    }
}