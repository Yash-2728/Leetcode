class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int i=0;
        // int j =0;
        // int count=1;
        
        // while(j<nums.length && i< nums.length){
        //     map.put(nums[j], map.getOrDefault(nums[j],0)+1);

        //    int a = map.get(nums[j]);
            
        //     while(a>k && i<nums.length ){
        //         map.put(nums[i], map.get(nums[i]-1));
        //         i++;
        //     }
            
        //     count = Math.max(count, j-i+1);
            
        //     j++;
        // }
        
        
        // return count;

        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            m.put(nums[j], m.getOrDefault(nums[j], 0) + 1);
            while (m.get(nums[j]) > k) {
                m.put(nums[i], m.get(nums[i]) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}