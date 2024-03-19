class Solution {
    public int leastInterval(char[] tasks, int n) {
        

        int p = tasks.length;
        Map<Character, Integer> mp = new HashMap<>();
        
        for (char ch : tasks) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        
        int time = 0;
        
        for (int freq : mp.values()) {
            if(freq > 0){
                pq.add(freq);

            }
           
        }
        
        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 1; i <= n + 1; i++) {
    
                if (!pq.isEmpty()) {
                    temp.add(pq.poll() - 1); 
                }
            }
            
            for (int freq : temp) {
                if(freq > 0){
                    pq.add(freq);

                }
                
            }
            
            if (pq.isEmpty())
                time += temp.size();
            else
                time += (n + 1); 
        }
        
        return time;
    }
}