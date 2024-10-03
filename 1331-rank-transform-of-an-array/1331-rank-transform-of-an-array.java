class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2 = arr.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Arrays.sort(arr2);
        
        for(int i=0; i<arr2.length; i++){
            map.putIfAbsent(arr2[i], map.size()+1);
        }
        
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        
        return arr;
    }
}