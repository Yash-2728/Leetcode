class Solution {
    public boolean checkValidString(String s) {
        int n= s.length();

        Stack<Integer> bk = new Stack();
        Stack<Integer> str = new Stack();

        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                bk.push(i);
            }
            else if(s.charAt(i)=='*'){
                str.push(i);
            }
            else{
                if(!bk.isEmpty()){
                    bk.pop();
                }
                else if(!str.isEmpty()){
                    str.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!bk.isEmpty() && !str.isEmpty()){
            if(bk.peek() < str.peek()){
                bk.pop();
                str.pop();
            }
            else{
                return false;
            }
        }


        if(bk.isEmpty()){
            return true;
        }

        return false;


        
        
        
            
        
        
    }
}

