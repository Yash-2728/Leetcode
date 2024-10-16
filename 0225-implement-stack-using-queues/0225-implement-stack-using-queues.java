class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){
            q1.offer(x);
        }
        else{
            q2.offer(x);
        }
    }
    
    public int pop() {
        if(q1.isEmpty() && !q2.isEmpty()){
            while(q2.size()>1){
                q1.offer(q2.poll());
            }
            return q2.poll();
        }
        else if(q2.isEmpty() && !q1.isEmpty()){
            while(q1.size()>1){
                q2.offer(q1.poll());
            }
            return q1.poll();
        }
        
        return q2.poll();
    }
    
    public int top() {
        int a=0;
        if(q1.isEmpty() && !q2.isEmpty()){
            while(q2.size()>1){
                q1.offer(q2.poll());
            }
             a = q2.peek();
            q1.offer(q2.poll());
            
        }
        else if(q2.isEmpty() && !q1.isEmpty()){
            while(q1.size()>1){
                q2.offer(q1.poll());
            }
             a = q1.poll();
            q2.offer(q1.poll());
        }
        
        return a;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */