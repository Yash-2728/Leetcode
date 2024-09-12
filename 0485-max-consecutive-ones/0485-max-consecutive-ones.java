class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int result  = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]==1){
                count+= 1;
            }
            else{
                count=0;
            }


            result = Math.max(result, count);


        }


        return result;
    }
}