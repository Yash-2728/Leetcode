class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
       for(int i = nums2.length-1; i>=0; i--){
           if(st.isEmpty()){
               map.put(nums2[i], -1);
           }
           else if(nums2[i]< st.peek() && !st.isEmpty()){
               map.put(nums2[i], st.peek());
           }
           else if(nums2[i]>st.peek()){
               while(!st.isEmpty() && nums2[i]> st.peek()){
                   st.pop();
               }
               if(st.isEmpty()){
                   map.put(nums2[i], -1);
               }
               else{
                   map.put(nums2[i], st.peek());
               }
           }
           
           st.push(nums2[i]);
       }
        
        
        int arr[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            arr[i] = map.get(nums1[i]);
        }
        
        return arr;
        
    }
}