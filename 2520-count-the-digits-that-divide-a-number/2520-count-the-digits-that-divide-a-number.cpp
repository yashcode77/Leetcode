class Solution {
public:
    int countDigits(int num) {
        int number = num;
        int count = 0;
        while(num>0){
            int rem = num%10;
            if(number%rem==0) count++;
            num /= 10;
        }
        return count;
    }
};