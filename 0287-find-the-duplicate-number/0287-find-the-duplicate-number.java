class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        Set<Integer> keys = map.keySet();
        for(int k: keys ){
            if(map.get(k)>1){
                return k;
            }
        }
        
        
        return -1;
    }
}