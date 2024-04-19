class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }
        
        return pq.poll();
    }
}