class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int end=0;
        int start =0;
        int p = 1;
        int count=0;
        if(k<=1) return 0;
        while(end < nums.length){
            p *= nums[end];
            
            while(p>=k && start<nums.length){
                p=p/ nums[start];
                start++;
            }
            
            if(p<k){
                count+= end-start+1;
            }
            
            end++;
        }
        
        
        
        return count;
    }
}