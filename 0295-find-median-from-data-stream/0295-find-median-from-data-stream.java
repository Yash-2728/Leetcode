class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private int count;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        count =0;
    }
    
    public void addNum(int num) {
        count++;
        if(maxHeap.isEmpty() || num<= maxHeap.peek() ){
            maxHeap.offer(num);
        }
        else{
            minHeap.offer(num);
        }
        
        if(maxHeap.size()> minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        }
        else if(minHeap.size()> maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(count%2==0){
            return (minHeap.peek() + maxHeap.peek())/2.0;
        }
        else{
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */