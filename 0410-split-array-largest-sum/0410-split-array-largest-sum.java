class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 10_000_000_00;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(mid,nums, k)){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public boolean check(int t, int arr[], int k){
        int count = 0;
        int res = 0;
        for(int ele: arr){
            if(ele>t) return false;
            if(ele+res>t){
                count++;
                res = ele;
                }
            else res+=ele;
        }
        return count<=k-1;
    }
}