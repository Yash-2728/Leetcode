import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums, 0, nums.length);
        int n= nums.length;

        int majorElement =0;
        int count=1;
        if(n==1){
            return nums[n-1];
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1] ){
                count++;
            }
            else{
                count=1;
            }

            if(count>n/2){
                majorElement = nums[i];
                
            }
        }

        return majorElement;
    }
}