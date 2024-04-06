class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else if(s.charAt(i)==')' ){
                if(stack.isEmpty()){
                    set.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            if(!set.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
        
        
    }
}