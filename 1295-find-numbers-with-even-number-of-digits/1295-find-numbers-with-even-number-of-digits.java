class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(isEvenDigits(num)){
                count++;
            }
        }
               return count;
    }
    boolean isEvenDigits(int num){
        if(num<0){
            num*=-1;
        }
        int length = (int)Math.log10(num)+1;
        if(length%2==0)
            return true;
        return false;
    }
}