class Solution {
    public int smallestDistancePair(int[] nums, int k) {// basic n^2 approach
        int n = nums.length;
        int maxElement = Arrays.stream(nums).max().getAsInt();
        
        int arr [] = new int [maxElement+1];
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int d = Math.abs(nums[i]-nums[j]);
                arr[d]++;
            }
        }
        
        
        for(int i=0; i<arr.length; i++){
            k -= arr[i];
            if(k<=0){
                return i;
            }
            
            
        }
        
        
        
        return -1;
    }
}