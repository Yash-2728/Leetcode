//Basic Brute force O(n^3)
class Solution {
    public String longestPalindrome(String s) {
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
    
    public boolean isPalindrome(String s, int l , int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}