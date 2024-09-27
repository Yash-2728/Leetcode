class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list  = new ArrayList<>();
        
        Helper(0, target,candidates,  list, result);
        return result;
    }
    
    public void Helper(int idx, int target, int[] candidates, List<Integer> list, List<List<Integer>> result){
        if(target<0 || idx>candidates.length-1){
            return ;
        }
        if(target==0 ){
            System.out.println(list);
            List<Integer> list2 = new ArrayList<>(list);
            result.add(list2);
            
            return; 
        }
        
        
        
        list.add(candidates[idx]);
        Helper(idx, target-candidates[idx],candidates,  list, result );
        list.remove(list.size()-1);
        Helper(idx+1, target,candidates, list, result);
        
        
    }
}