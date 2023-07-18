class Solution {
public:
    int maxArea(vector<int>& height) {
        int lh = 0;
        int rh = height.size()-1;
        int area = INT_MIN;
        int temp;
        while(lh<rh){
            temp = min(height[lh],height[rh])*(rh-lh);
            if(temp > area) area = temp;
            if(height[lh]<height[rh]) lh++;
            else rh--;
        }
        return area;
    }
};