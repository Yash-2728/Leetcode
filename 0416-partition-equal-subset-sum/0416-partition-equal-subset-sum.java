class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+= nums[i];
        }
        
        int w = sum/2;
        
        int dp[][] = new int[n+1][w+1];
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(nums[i-1]<= j){
                    dp[i][j] = Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],  dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        int sum1 = dp[n][w];
        int sum2 = sum-sum1;
        if(Math.abs(sum1 -sum2)>0){
            return false;
        }
        else{
            return true;
        }
    }
}