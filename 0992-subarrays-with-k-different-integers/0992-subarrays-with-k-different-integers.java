class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k==1){
            return subArray(nums,k);
        }
        else{
            return subArray(nums,k) - subArray(nums, k-1);
        }
    }

    public int subArray(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int ans=0;

        while(j<n){
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);

            while(map.size()>k){
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;

            }

            ans += (j-i+1);
            j++;


        }

        return ans;

    }
}