class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int assign = 2;
        int result = 0;
        
        for(char ch :word.toCharArray()){
            if(assign>9){
                assign =2;
            }
            
            map.put(assign, map.getOrDefault(assign, 0)+1);
            result +=map.get(assign);
            assign++;
        }
        
        
        return result;
    }
}