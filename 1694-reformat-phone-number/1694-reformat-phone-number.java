class Solution {
    public String reformatNumber(String number) {
        List<Integer> list = new ArrayList<>();
        char ch;
        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            if (ch >= '0' && ch <= '9') {
                list.add(ch - '0');
            }
        }
        
        int n = list.size();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (n - i > 4) {
            for (int j = 0; j < 3; j++) {
                sb.append(list.get(i));
                i++;
            }
            sb.append('-');
        }
        if (n - i == 4) {
            for (int j = 0; j < 2; j++) {
                sb.append(list.get(i));
                i++;
            }
            sb.append('-');
        }
        while (i < n) {
            sb.append(list.get(i));
            i++;
        } 
        
   
            
        return sb.toString();
        
    }
}