class Solution {
    public int differenceOfSum(int[] nums) {
       int elementSum = 0;
    int digitSum = 0;
    for (int num : nums) {
        elementSum += num;
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length(); i++) {
            digitSum += numString.charAt(i) - '0';
        }
    }
    return Math.abs(elementSum - digitSum);   
    }
}