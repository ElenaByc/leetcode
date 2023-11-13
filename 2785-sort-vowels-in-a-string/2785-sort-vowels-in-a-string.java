class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        int[] vowels = new int[10];
        char[] result = new char[n];
        String sortedVowel = "AEIOUaeiou";
        char ch;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (isVowel(ch)) {
                switch (ch) {
                    case 'A':
                        vowels[0]++;
                        break;
                    case 'E':
                        vowels[1]++;
                        break;
                    case 'I':
                        vowels[2]++;
                        break;
                    case 'O':
                        vowels[3]++;
                        break;
                    case 'U':
                        vowels[4]++;
                        break;
                    case 'a':
                        vowels[5]++;
                        break;
                    case 'e':
                        vowels[6]++;
                        break;
                    case 'i':
                        vowels[7]++;
                        break;
                    case 'o':
                        vowels[8]++;
                        break;
                    case 'u':
                        vowels[9]++;
                        break;
                }
                result[i] = 'a';
            } else {
                result[i] = ch;
            }
        }
        
        int j = 0;
        while (j < 10 && vowels[j] == 0) {
            j++;
        }
        if (j == 10) {
             return new String(result);
        }
        ch = sortedVowel.charAt(j);
        for (int i = 0; i < n; i++) {
            if (result[i] == 'a') {
                while (vowels[j] == 0) {
                    j++;
                }
                ch = sortedVowel.charAt(j);
                result[i] = ch;
                vowels[j]--;
            }
        }
        
        return new String(result);
    }
    
    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
               || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U');
    }
}