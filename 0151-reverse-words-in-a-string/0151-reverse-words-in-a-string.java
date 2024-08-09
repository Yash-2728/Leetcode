class Solution {
    public String reverseWords(String s) {
        // String str =s;
        Stack<String> st = new Stack<>();
        // String words[] = str.split("\\s+");
        
        // for(int i=0 ;i<words.length; i++){
        //     st.add(words[i]);
        // }
        StringBuilder sb;
        int i=0;
        while(i< s.length()){
            char c = s.charAt(i);
            if(c !=' '){
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


        
        sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()){
                sb.append(' ');
            }
        }

        
        
        return sb.toString();
    }
}