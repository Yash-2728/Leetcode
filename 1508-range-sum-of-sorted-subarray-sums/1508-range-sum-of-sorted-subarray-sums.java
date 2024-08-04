class Solution {
    private static int m = 1000000007;
    class Pair implements Comparable<Pair>{
        int sum;
        int index;

        Pair(int s, int i){
            this.sum = s;
            this.index = i;
        }

        @Override
        public int compareTo(Pair other){
            return Integer.compare(this.sum, other.sum);
        }
    }
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.offer(new Pair(nums[i], i));
        }

        int result = 0;

        for(int i=1; i<=right;i++){
            Pair p = pq.poll();

            if(i>= left){
                result = (result + p.sum) % m;
            }

            if(p.index < n-1){
                p.index++;
                p.sum += nums[p.index];
                pq.offer(p);
            }
        }

        return result;
    }
}