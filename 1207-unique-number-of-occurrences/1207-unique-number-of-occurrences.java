class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i])) 
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
        for(Integer i:map.keySet()) 
        {
            if(list.contains(map.get(i)))
            {
                return false;
            }
            list.add(map.get(i));            
        }
        return true;

        
    }
}