class Solution {
    public int fillCups(int[] amount) {
        int coldcups = amount[0];
        int warmcups = amount[1]; 
        int hotcups = amount[2];
        int minimumSeconds = 0;

        while (coldcups > 0 || warmcups > 0 || hotcups > 0) {
            if (coldcups <= warmcups && coldcups <= hotcups) {
                warmcups--;
                hotcups--;
            } else if (warmcups <= coldcups && warmcups <= hotcups) {
                hotcups--;
                coldcups--;
            } else {
                warmcups--;
                coldcups--;
            }
            minimumSeconds++;
        }

        return minimumSeconds;
    }
}