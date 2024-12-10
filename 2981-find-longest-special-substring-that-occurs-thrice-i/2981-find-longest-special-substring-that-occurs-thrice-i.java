class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i ; j<n; j++){
                if(sb.length()==0 || sb.charAt(sb.length()-1)== s.charAt(j)){
                    sb.append(s.charAt(j));
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
                }
                else{
                    break;
                }
            }
        }
        
        
        
        
        int result =0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String str = entry.getKey();
            int val = entry.getValue();
            
            if(val>=3 && str.length()>result){
                result = str.length();
            }
            
            
        }
        
        return result==0 ? -1 : result;
        
        
        
    }
}