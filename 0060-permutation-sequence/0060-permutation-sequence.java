class Solution {
    public String getPermutation(int n, int k) {
        int permutations = 1;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            list.add(i);
            permutations = permutations*i; 
        }
        list.add(n);
        String ans = "";
        k = k-1;
        
        while(true){
            ans = ans+ list.get(k/permutations);
            list.remove(k/permutations);
            if(list.size()==0){
                break;
            }
             k = k%permutations;
            permutations =  permutations/ list.size();
        }
        
        
        return ans;
    }
}