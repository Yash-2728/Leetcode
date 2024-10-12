class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        
        while(l<h){
            int mid = l + (h-l)/2;
            boolean isEven;
            
            if((h-mid)%2==0){
                isEven = true;
            }
            else{
                isEven = false;
            }
            
            if(nums[mid]==nums[mid+1]){
                if(isEven){
                    l = mid+1;
                }
                else{
                    h = mid-1;
                }
            }
            else{
                if(isEven){
                    if(nums[mid]== nums[mid-1]){
                        h = mid-2;
                    }
                    else{
                        h = mid;
                    }
                }
                else{
                    l = mid+1;
                }
            }
           
        }
        
        
        return nums[l];
    }
}