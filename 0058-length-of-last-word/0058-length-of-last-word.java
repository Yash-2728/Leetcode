class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;
        int n = s.length();

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)==' '){
                if(k>0){
                    return k;
                }
                else{
                    continue;
                }
            }
            else{
                k++;
            }
            
        }

        return k;
    }
}