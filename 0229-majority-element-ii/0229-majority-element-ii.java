class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        if(n==1){
            list.add(nums[n-1]);
            return list;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        Set<Integer> keys = map.keySet();
        for(int k : keys){
            if(map.get(k) > n/3){
                list.add(k);
                
            }
        }
        
        
        
        return list;
    }
}