class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int i=0; 
        while(i<s.length() ){
            char ch = s.charAt(i);
            if(ch!=' '){
                sb = new StringBuilder();
                
                while(i<s.length() && s.charAt(i)!=' '){
                    sb.append(s.charAt(i));
                    i++;
                }
                
                st.push(sb.toString());
            }
            else{
                 i++;
            }
        }
        
        
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
            if(!st.isEmpty()){
                result.append(' ');
            }
        }
        
        return result.toString();
    }
}