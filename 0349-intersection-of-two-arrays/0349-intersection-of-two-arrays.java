class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        
        for(int num : nums1){
            set.add(num);
        }
        
        for(int num2 : nums2){
            if(set.contains(num2)){
                result.add(num2);
            }
        }
        
        int k[] = new int[result.size()];
        int f=0;
        for(int r : result){
            k[f++]= r;
        }
        
        
        return k;
    }
}