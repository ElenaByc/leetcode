class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeroCnt = 0;
        int oneCnt = 0;
        int n = students.length;
        
        for (int s : students) {
            if (s == 0) {
                zeroCnt++;
            } else {
                oneCnt++;
            }
        }
        for (int s : sandwiches) {
            if (s == 0 && zeroCnt > 0) {
                zeroCnt--;
            } else if (s == 1 && oneCnt > 0) {
                oneCnt--;
            } else {
                break;
            }
        }
        
        return  zeroCnt + oneCnt;
    }
}