class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int cnt = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int num : students) {
             queue.offer(num);
        }
        
        int i = 0; // sandwiches pointer
        int unableCounter = 0;
        
        while (cnt < n && queue.size() > 0 && unableCounter < queue.size()) {
            if (queue.peek() == sandwiches[i]) {
                i++;
                cnt++;
                queue.poll();
                unableCounter = 0;
            } else {
                queue.offer(queue.poll());
                unableCounter++;
            }
        }
        
        return n - cnt;
    }
}