class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        unordered_map<int,int> mp1;
        unordered_map<int,int> mp2;
        for(int i : nums1){
            mp1[i]++;
        }
        for(int i : nums2){
            mp2[i]++;
        }
        for(auto i : mp1){
            if(mp2.count(i.first)>0) ans.push_back(i.first);
        }
        return ans;
    }
};