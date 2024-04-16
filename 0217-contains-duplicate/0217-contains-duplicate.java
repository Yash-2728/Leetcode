class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        if(n==1){
            return false;
        }
        HashSet<Integer> map = new HashSet<>();
        map.add(nums[0]);
        for(int i=1; i<n; i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        
        return false;
    }
}