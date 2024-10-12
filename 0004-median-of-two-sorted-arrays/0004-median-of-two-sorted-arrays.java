class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        int[] temp = new int[n+m];
        
        int i = 0;
        int j =0; 
        int k=0;
        
        while(i<n && j<m){
            if(nums1[i]<= nums2[j]){
                temp[k++] = nums1[i++];
            }
            else{
                temp[k++] = nums2[j++];
            }
        }
        
        while(i<n){
            temp[k++] = nums1[i++];
        }
        while(j<m){
            temp[k++] = nums2[j++];
        }
        
        
        for(int l=0; l<temp.length; l++){
            System.out.print(temp[l]+" ");
        }
        
        
        if((n+m)%2==0){
            return (temp[((n+m)/2)-1] + temp[((n+m)/2)])/2.0;
        }else{
            return temp[(n+m)/2];
        }
    }
}