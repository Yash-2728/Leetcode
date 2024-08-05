class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n  = arr.length;
        
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0; i<n ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int l =0;

        for(int i=0; i<n ; i++){
            if(map.get(arr[i])==1 && l==k-1){
                return arr[i];
            }
             if(map.get(arr[i])==1){
                l++;
            }

        }

        String s = "";

        return s;
    }
}