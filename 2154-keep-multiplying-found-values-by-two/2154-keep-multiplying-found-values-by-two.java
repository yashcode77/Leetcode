class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> has= new HashSet<>(nums.length);
        for (int i=0;i<=nums.length-1;i++)
            has.add(nums[i]);
        for (int i=0;i<=nums.length-1;i++) {
            if (!has.contains(original))
                break;
            original = original * 2;
        }
        return original; 
    }
}