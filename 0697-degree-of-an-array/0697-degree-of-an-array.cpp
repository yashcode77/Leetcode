class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        int size = nums.size();
        int degree = 0;
        unordered_map<int,int> map;
        unordered_map<int,int> firstOcc;
        int minLength = 0;

        for(int i=0; i<size; i++){
            if(!map.count(nums[i])) firstOcc[nums[i]]=i;
            map[nums[i]]++;
            if(map[nums[i]]>degree){
                degree = map[nums[i]];
                minLength = i-firstOcc[nums[i]]+1;
            } else if(map[nums[i]]==degree){
                minLength = min(minLength, i-firstOcc[nums[i]]+1);
            }
        }
        return minLength;
    }
};