class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[]= new int[n-k+1];

        
        if(n==0){
            return result;
        }
        int p=0;

        Deque<Integer> dq = new ArrayDeque<>();
        

        for(int i=0; i<n ; i++){
            
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){
                result[p++]=nums[dq.peekFirst()];
            }
        }

        return result;


    



    }
}