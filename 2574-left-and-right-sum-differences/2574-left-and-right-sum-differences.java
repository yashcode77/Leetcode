class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int left = 0;
            int right = 0;
            for(int j=0; j<i;j++){
                left += nums[j];
            }
            for(int k=i+1; k<nums.length; k++){
                right += nums[k];
            }
            ans[i] = mod(left - right);
        }
        return ans;
    }
    public int mod(int num){
        if(num >= 0) return num;
        else return -1*num;
    }
}