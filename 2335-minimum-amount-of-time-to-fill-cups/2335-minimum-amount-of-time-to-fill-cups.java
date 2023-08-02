class Solution {
    public int fillCups(int[] amount) {
        int coldcups = amount[0];
        int warmcups = amount[1]; 
        int hotcups = amount[2];
        int minimumSeconds = 0;

        while (coldcups > 0 || warmcups > 0 || hotcups > 0) {
            if (coldcups <= warmcups && coldcups <= hotcups) {
                warmcups = warmcups > 0 ? warmcups - 1 : 0;
                hotcups = hotcups > 0 ? hotcups - 1 : 0;
            } else if (warmcups <= coldcups && warmcups <= hotcups) {
                hotcups = hotcups > 0 ? hotcups - 1 : 0;
                coldcups = coldcups > 0 ? coldcups - 1 : 0;
            } else {
                warmcups = warmcups > 0 ? warmcups - 1 : 0;
                coldcups = coldcups > 0 ? coldcups - 1 : 0;
            }
            minimumSeconds++;
        }

        return minimumSeconds;
    }
}