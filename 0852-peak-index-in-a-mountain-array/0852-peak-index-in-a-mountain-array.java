class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid == 0) {
                if (arr[mid + 1] < arr[mid]) {
                    return mid;
                } else {
                    return mid + 1;
                }
            } 
            if(arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}