class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int i=0;
        int j=0;
        int n = deck.length;
        int result[]= new int[n];
        boolean skip = false;

        Arrays.sort(deck);
        for(int k=0; k<n; k++){
            result[k]=0;
        }

        while(i<n){
            if(result[j]==0){
                if(!skip){
                    result[j]=deck[i];
                    i++;
                }
                skip = !skip;
            }

            j = (j+1)%n;
        }

        return result;
    }
}