class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
                int bottomBorder = matrix.length - 1;
        int topBorder = 0;
        int leftBorder = 0;
        int rightBorder = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();
        
        while(true) {

            for (int i = leftBorder; i <= rightBorder; i++)
                result.add(matrix[topBorder][i]);
            topBorder++;
            
            if (topBorder > bottomBorder)
                break;

            for (int i = topBorder; i <= bottomBorder; i++)
                result.add(matrix[i][rightBorder]);
            rightBorder--;

            if (rightBorder < leftBorder)
                break;

            for (int i = rightBorder; i >= leftBorder; i--)
                result.add(matrix[bottomBorder][i]);
            bottomBorder--;

            if (bottomBorder < topBorder)
                break;

            for (int i = bottomBorder; i >= topBorder; i--)
                result.add(matrix[i][leftBorder]);
            leftBorder++;

            if (leftBorder > rightBorder)
                break;
        }
        return result;
    }
}