class KthLargest {
    
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(final int num : nums){
            heapify(num);
        }
    }
    
    public int add(int val) {
        heapify(val);
        return minHeap.peek();
    }

    private void heapify(int val){
        minHeap.offer(val);
        if(minHeap.size() > k){
            minHeap.poll();
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */