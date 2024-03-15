class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

        }

        int max = Integer.MIN_VALUE;
        Set<Integer> keys = map.keySet();
        for(int k : keys){
            max = Math.max(max, map.get(k));
        }

        int count=0;
        for(int k : keys){
            if(map.get(k)==max){
                count++;
            }
        }

        return count*max;
    }
}