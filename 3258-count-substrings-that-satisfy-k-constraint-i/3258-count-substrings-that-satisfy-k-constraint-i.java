class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int countOne=0;
        int countZero =0;
        int i=0;
        int j=0;
        
        int ways = 0;

        while(j<n){

            if(s.charAt(j)=='0'){
                countZero++;
            }
            else if(s.charAt(j)=='1'){
                countOne++;
            }


            while(countOne > k && countZero > k){
                if(s.charAt(i)=='0'){
                    countZero--;
                }
                else{
                    countOne--;
                }

                i++;
            
            } 
            ways += (j-i+1);
            


            j++;
        }

        return ways;
    }
}