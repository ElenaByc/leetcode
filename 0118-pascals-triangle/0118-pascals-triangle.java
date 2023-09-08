class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        
        row.add(1);
        triangle.add(row);
        int rowNum = 2;
        while (rowNum <= numRows) {
            row = new ArrayList<>();
            for (int i = 0; i < rowNum; i++) {
                if (i == 0 || i == rowNum - 1) {
                    row.add(1);
                } else {
                    row.add(triangle.get(rowNum - 2).get(i-1) + triangle.get(rowNum - 2).get(i));
                }
            }
            triangle.add(row);
            rowNum++;
        }
        
        return triangle;
    }
}