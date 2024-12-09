// Recursion + Memoisation 
class Solution {
    private int dp[][];
    
    public String longestPalindrome(String s) {
        dp = new int[s.length()][s.length()];
        for(int arr[]: dp){
            Arrays.fill(arr, -1);
        }
        int longest = 0;
        int sp = -1;
        // where sp refers to the starting point 
         for(int i=0; i<s.length(); i++){
             for(int j=i; j<s.length(); j++){
                 if(isPalindrome(s, i, j)){
                    if(longest < j-i+1){
                        longest = j-i+1;
                        sp = i;
                    }
                 }
             }
         }
       return s.substring(sp, sp+longest);

        
        
    }
    
    public boolean isPalindrome(String s , int l, int r){
        if(l>=r){
            return true; 
        }
        
        if(dp[l][r]!=-1){
            return dp[l][r]==1;
        }
        
        if(s.charAt(l)== s.charAt(r)){
            dp[l][r] = isPalindrome(s, l+1, r-1) ? 1:0;
        }
        else{
            dp[l][r] = 0;
        }
        
        return dp[l][r] ==1;
        
        
    }
}