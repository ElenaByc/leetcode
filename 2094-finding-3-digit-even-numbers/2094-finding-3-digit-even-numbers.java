class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] arr1 = new int[10];
        int cnt = 0;
        for (int i : digits) {
            arr1[i]++;
            if (i % 2 == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            return new int[]{};
        }
        int[] arr2;
        int n;
        boolean addToList;
        List<Integer> list = new ArrayList<>(); 
        for (int i = 100; i < 1000; i +=2) {
            arr2 = new int[10];
            n = i;
            addToList = true;
            while (n > 0) {
                arr2[n % 10]++;
                n /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if(arr2[j] > arr1[j]) {
                    addToList = false;
                    break;
                }
            }
            if (addToList) {
                list.add(i);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }        
        
        return result;
    }
}