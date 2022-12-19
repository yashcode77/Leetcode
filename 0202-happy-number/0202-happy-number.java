class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
           slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }while(fast != slow);
        
        if(slow == 1)
            return true;
        return false;
    }
    
    int sumOfSquares(int num){
        int sum = 0;
        int digit;
        while(num > 0){
            digit = num % 10;
            sum += digit*digit;
            num /= 10;
        }
        return sum;
    }
    
}