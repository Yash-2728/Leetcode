class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)- map.get(b));
        // yahan mai priority queue me direct map k key elements hi daal raha hun aur unki value k basis pe sort kar raha hun queue k andar
        for(int num: map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
       
        
        int temp[] = new int[k];
        
       for(int i = k-1; i>=0; i--){
           temp[i] = pq.poll();
       }
        
        return temp;
    }
}