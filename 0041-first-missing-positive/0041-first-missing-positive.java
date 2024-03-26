class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
        boolean has1 = false;
        
        
        for(int i=0; i<nums.length ; i++){
            if(nums[i]>n || nums[i]<=0){
                nums[i]=1;
            }
            else if(nums[i]==1){
                has1 = true;
            }
        }
        
        if(!has1){
            return 1;
        }
        
        
        for(int i=0; i<n ;i++){
            // int a = Math.abs(nums[i]);
            // nums[a-1]=-1;
            
            int val = Math.abs(nums[i]);
            int idx = val - 1;

            if (nums[idx] < 0) continue;
            nums[idx] *= -1;
        }
        
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        
        return n+1;
        
        
    }
}