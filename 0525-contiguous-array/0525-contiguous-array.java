class Solution {
    public int findMaxLength(int[] nums) {
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int n = nums.length;
        int result=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum=0;
        map.put(currSum,-1);
        
        for(int i=0 ; i<n; i++){
            currSum += nums[i];
            if(map.containsKey(currSum)){
                int k = map.get(currSum);
                result = Math.max(result, i-k);
            }
            else{
                map.put(currSum, i);
            }
        }
        
        
        return result;
        
    }
}