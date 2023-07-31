class Solution {
public:
    bool isPalindrome(int x) {
        int num = x;
        if(x<0) return false;
        long long reverse = 0;
        while(x>0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x/=10;
        }
        cout << reverse;
        return reverse == num;
    }
};