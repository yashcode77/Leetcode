class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans;
        map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]=i;
        }
        for(int i=0;i<nums.size();i++){
            int complement = target-nums[i];
            if(mp.count(complement) && mp[complement]!=i){
                return {i,mp[complement]};
            }
        }
        return {};
    }
};