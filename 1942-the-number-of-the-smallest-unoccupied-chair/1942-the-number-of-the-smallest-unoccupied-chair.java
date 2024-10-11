class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
       
        int targetFrndArrival = times[targetFriend][0];
        
        PriorityQueue<int[]> occupiedChair = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        
        PriorityQueue<Integer > freeChair= new PriorityQueue<>();
        
        int chairNo=0;
        
        Arrays.sort(times, Comparator.comparingInt(a-> a[0]));
        
        
        
        for(int[] time : times){
            int arrival = time[0];
            int dep = time[1];
            
            while(!occupiedChair.isEmpty() && occupiedChair.peek()[0]<= arrival){
                freeChair.offer(occupiedChair.poll()[1]);
            }
            
            if(freeChair.isEmpty()){
                occupiedChair.offer(new int[]{dep, chairNo});
                if(targetFrndArrival==arrival){
                    return chairNo;
                }
                chairNo++;
            }
            else{
                int leastNoFreeChair = freeChair.poll();
                if(targetFrndArrival== arrival){
                    return leastNoFreeChair;
                }
                occupiedChair.offer(new int[]{dep, leastNoFreeChair});
            }
        }
        
        return -1;
        
        
    }
}