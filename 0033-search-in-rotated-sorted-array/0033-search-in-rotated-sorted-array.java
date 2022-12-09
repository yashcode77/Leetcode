class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int pivot=pivotSearch(nums);
        int ans;
        ans = binarySearch(nums, target, start, pivot);
        if(ans==-1){
            ans = binarySearch(nums, target, pivot+1, end);
        }
        return ans;
        }
    int pivotSearch(int[] arr){
         int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
}
    int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
    