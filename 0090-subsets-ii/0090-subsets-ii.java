class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        helper(0, nums, result, list);
        
        return new ArrayList<>(result);
        
    }
    
    public void helper(int idx, int nums[], Set<List<Integer>> result, List<Integer> list){
        if(idx == nums.length){
            List<Integer> test = new ArrayList<>(list);
                Collections.sort(test);
            result.add(test);
            return;
        }
        
        list.add(nums[idx]);
        helper(idx+1, nums, result, list);
        list.remove(list.size()-1);
        helper(idx+1, nums, result, list);
    }
}