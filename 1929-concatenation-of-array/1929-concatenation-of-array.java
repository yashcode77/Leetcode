class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int newLength=2*nums.length;
        int[] ans = new int[newLength];
        for(int i=0; i<n; i++){
            ans[i]=nums[i];
        }
        for(int j=0; j<n; j++){
            ans[j+n]=nums[j];
        }
        return ans;
    }
}