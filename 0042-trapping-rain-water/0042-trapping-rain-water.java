class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int leftGreater[]= new int[n];
        int rightGreater[]= new int[n];
        int count=0;
        
        
        leftGreater[0]= height[0];
        rightGreater[n-1]=height[n-1];
        
        for(int i=1; i<n; i++){
            leftGreater[i]= Math.max(height[i], leftGreater[i-1]);
        }
        
        for(int i=n-2; i>=0;i--){
            rightGreater[i]= Math.max(height[i], rightGreater[i+1]);
        }
        
        for(int i=0; i<n; i++){
            int water = Math.min(leftGreater[i], rightGreater[i]);
            count += (water-height[i])*1;
        }
        
        
        
        
        return count;
        
        
        
        
    }
}