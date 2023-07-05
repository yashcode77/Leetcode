class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int,int> mp;
        for(int i : nums){
            mp[i]++;
        }
        for(auto i : mp){
            if(mp[i.first]==2) ans.push_back(i.first);
        }
        return ans;
    }
};