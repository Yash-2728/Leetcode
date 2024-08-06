class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for(char ch : word.toCharArray()){
                freq[ch-'a']++;
        }
        
        int result =0;
        Integer [] freqInteger = Arrays.stream(freq).boxed().toArray(Integer[]::new);// converting int array to Integer array
        
        Arrays.sort(freqInteger, Comparator.reverseOrder());
        
        for(int i=0 ; i<26; i++){
            result += ((i/8)+1)*freqInteger[i];
        }
        
        
        return result;
        
    }
}