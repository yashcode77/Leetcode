class Solution {
    public int thirdMax(int[] nums) {
        HashSet <Integer> hs = new HashSet <>();
        for(int i : nums){
            hs.add(i);
        }
        ArrayList <Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        if(list.size() < 3) return list.get(list.size()-1);
        else return list.get(list.size()-3);
    }
}