class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int mid;
        while(s<=e){
            mid = s+(e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[s]==target) return s;
            else if(nums[e]==target) return e;
            else if(nums[mid]>target) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}