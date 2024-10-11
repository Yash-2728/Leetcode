class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        List<Integer> temp = new ArrayList<>();
        solve(temp, nums);
        return result;
    }

    public void solve(List<Integer> temp , int nums[]){
        if(temp.size()==n){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<n; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                temp.add(nums[i]);
                solve(temp, nums);
                temp.remove(temp.size()-1);
                set.remove(nums[i]);
            }
        }
    }
}