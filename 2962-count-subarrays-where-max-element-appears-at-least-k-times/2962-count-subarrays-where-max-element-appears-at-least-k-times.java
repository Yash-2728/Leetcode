class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int n = nums.length;
        int i =0;
        int j=0; 
        int countMax=0;
        long ans = 0;

        
        

        while( j < n){

            if(nums[j] == max){
                countMax++;
            }
            while(countMax >= k){
                ans += n - j;
                if(nums[i] == max){
                    countMax--;
                }
                i++;
            }
            j++;
        }

        return ans;

        // int maxE = Arrays.stream(nums).max().getAsInt();

        // int n = nums.length;
        // int i = 0, j = 0;

        // long result = 0;
        // int countMax = 0;

        // while (j < n) {
        //     if (nums[j] == maxE) {
        //         countMax++;
        //     }

        //     while (countMax >= k) {
        //         result += n - j;

        //         if (nums[i] == maxE) {
        //             countMax--;
        //         }
        //         i++;
        //     }
        //     j++;
        // }

        // return result;
        
    }
}