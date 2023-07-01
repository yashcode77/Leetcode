class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int size = nums.size();
        unordered_map<int,int> mp;
        for(int i=0; i<size;i++){
            mp[nums[i]]++;
        }
        int highestFrequency = INT_MIN;
        int mostFrequentDigit;
        for(auto i : mp){
            if(i.second > highestFrequency){
                highestFrequency = i.second;
                mostFrequentDigit = i.first;
            } 
        }
        return mostFrequentDigit;
    }
};