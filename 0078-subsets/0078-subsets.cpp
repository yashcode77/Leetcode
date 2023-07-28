class Solution {
public:
    void solve(vector<int> nums,vector<int> output, int index, vector<vector<int>> &ans){
        //base case
        if(index>=nums.size()){
            ans.push_back(output);
            return;
        }

        //exclude
        solve(nums,output,index+1,ans);

        //include
        output.push_back(nums[index]);
        solve(nums,output,index+1,ans);
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> output;
        int index = 0;
        solve(nums,output,index,ans);
        return ans;
    }
};