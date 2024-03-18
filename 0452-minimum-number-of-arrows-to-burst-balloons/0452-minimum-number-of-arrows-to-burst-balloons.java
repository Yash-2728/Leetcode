class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int n= points.length;

        int count =1;
        int lastEnd = points[0][1];

        for(int i=1; i<n; i++){
            int currStart = points[i][0];

            if(currStart > lastEnd){
                count++;
                lastEnd = points[i][1];
            }
        }

        return count;
        
      
    }
}