class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean> (candies.length);
        
        int max = Integer.MIN_VALUE;
        // Get the maximum number of candies from candies array
        for(int i = 0; i < candies.length; i++){
            
            if(candies[i] > max)
                max = candies[i];
        }
        
        for(int i = 0; i < candies.length; i++){
            list.add(i, (candies[i] + extraCandies >= max));
        }
        
        
        return list;
    }
}