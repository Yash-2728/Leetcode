class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int teams=0;
        
        for(int j=1; j<n-1; j++){
            int count_smallerLeft=0, count_largerLeft = 0,count_smallerRight=0, count_largerRight=0 ;
            
            for(int i=0;i<j; i++){
                if(rating[i]<rating[j]){
                    count_smallerLeft++;
                }
                if(rating[i]>rating[j]){
                    count_largerLeft++;
                }
            }
            
            for(int i=j+1;i<n; i++){
                if(rating[i]<rating[j]){
                    count_smallerRight++;
                }
                if(rating[i]>rating[j]){
                    count_largerRight++;
                }
            }
            
            teams+= count_smallerLeft * count_largerRight;
            teams+= count_largerLeft * count_smallerRight;
            
            
        }
        
        return teams;
    }
}