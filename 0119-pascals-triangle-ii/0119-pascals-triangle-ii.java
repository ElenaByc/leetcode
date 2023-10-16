class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow;
        List<Integer> currRow = new ArrayList<>();
        int row = 0;
        currRow.add(1);
        while (row < rowIndex) {
            row++;
            prevRow = currRow;
            currRow = new ArrayList<>();
            currRow.add(1);
            for (int i = 1; i < row; i++) {
                currRow.add(prevRow.get(i - 1) + prevRow.get(i));
            }
            currRow.add(1);
        }
        
        return currRow;
    }
}