class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int l = n/2; l>=1; l--){
            if(n%l==0){
                int times = n/l;
                String newstr = "";
                String add = s.substring(0,l);
                
                while(times-->0){
                    newstr+= add;
                }
                if(newstr.equals(s)){
                    return true;
                }
            }
        }
        
        
        
        return false;
    }
}