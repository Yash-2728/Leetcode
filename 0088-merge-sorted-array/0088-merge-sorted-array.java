import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int k = m;

        for(int i=0; i<n; i++){
            nums1[k]=nums2[i];
            k++; 
        }

        Arrays.sort(nums1, 0, m+n);
//         System.out.print("[");
//         System.out.print(nums1[0]);

//         for(int j=1; j<m+n; j++){
//              System.out.print(",");
//             System.out.print(nums1[j]);
//         }

//          System.out.print("]");
        
        
        



         
        
    }

    
}