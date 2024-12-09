class Solution {
    public String reverseWords(String s) {
        StringBuilder s1 = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                s1.append(s.charAt(i));
            }
            else if(s1.length()>0){
                st.push(s1.toString());
                s1 = new StringBuilder();
            }
            
            
        }
        
        if(s1.length()>0){
            st.push(s1.toString());
        }
        
        
        
        
        
        s1 = new StringBuilder();
        
        
        
        
        while(!st.isEmpty()){
            String k = st.pop();
            if(st.isEmpty()){
                            s1.append(k);
            }
            else{
                s1.append(k);
            s1.append(' ');
            }
           
        }
        
        
        return s1.toString();
        
        
    }
}