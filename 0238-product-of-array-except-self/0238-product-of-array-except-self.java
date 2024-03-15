class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[]= new int[n];
        int count_zero =0;
        int p_w_z = 1;
        // where p_w_z means product without zero

        for(int num: nums){
            if(num==0){
                count_zero++;
            }
            else{
                p_w_z = num * p_w_z;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                if(count_zero >0){
                    result[i]=0;
                }
                else{
                    result[i]= p_w_z/nums[i];
                    
                }
            }
            else{
                if(count_zero > 1){
                    result[i]=0;
                }
                else{
                    result[i]= p_w_z;
                }
            }
        }


        return result;
    }
}