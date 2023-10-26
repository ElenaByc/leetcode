class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int students0 = 0;
        int sandwiches0 = 0;
        
        for(int s : students){
            if(s == 0) {
                students0++;
            } 
        }    
        int students1 = n - students0;
        
        for(int s:sandwiches){
            if(s == 0) {
                sandwiches0++;
            }
        } 
        if(students0 == sandwiches0){
            return 0;
        }
        
        for(int s : sandwiches) {
            if(s == 0){
                if(students0 == 0) {
                    return students1;
                }
                students0--;
            } else {
                if(students1 == 0) {
                    return students0;
                }
                students1--;
            }
        }
        return 0;
    }  
}