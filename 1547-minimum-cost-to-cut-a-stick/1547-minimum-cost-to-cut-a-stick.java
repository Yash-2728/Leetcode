class Solution {
    
    // sabse pehle array ko sort karo uske baad naya array banao , elements copy karo , fir naye array se solve karna start karo aur recursion + memoization ka code likho
    
    int dp[][] = new int[103][103];
    
    public int minCost(int n, int[] cuts) {
        
        
        Arrays.sort(cuts);
        int newCuts[] = new int[cuts.length+2];
        newCuts[0]=0;
        System.arraycopy(cuts, 0, newCuts, 1, cuts.length);
        newCuts[newCuts.length-1] = n;
        
        for(int at[] : dp){
            Arrays.fill(at, -1);
        }
        
        return solve(newCuts, 0, newCuts.length-1);
        
        
    }
    
    public int solve(int arr[] , int l, int r ){
        if(r-l==1){
            return 0;
        }
        
        if(dp[l][r]!= -1){
            return dp[l][r];
        }
        
        int result = Integer.MAX_VALUE;
        
        for(int index = l+1; index<=r-1; index++){
            int cost = solve(arr, l, index) + solve(arr, index, r) + (arr[r]-arr[l]);
            result = Math.min(result , cost);
        }
        
        return dp[l][r] = result;
    }
}