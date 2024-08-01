class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s : details){

            int a = (s.charAt(11)-'0')*10;
            int b = s.charAt(12)-'0';
            
            if(a+b > 60){
                count++;
            }
        }
        
        return count;
    }
}