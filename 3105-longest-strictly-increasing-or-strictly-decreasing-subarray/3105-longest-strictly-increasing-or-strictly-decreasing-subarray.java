class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incr = 1;
        int decr = 1;
        int result = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                incr++;
                decr =1;

                //result = Math.max(incr, decr);
            }
            else if(nums[i]<nums[i-1]){
                decr++;
                incr = 1;

                //result = Math.max(incr, decr);
            }
            else{
                incr = 1;
                decr = 1;
            }

            result = Math.max(result, Math.max(incr, decr));
        }

        return result;
    }
}