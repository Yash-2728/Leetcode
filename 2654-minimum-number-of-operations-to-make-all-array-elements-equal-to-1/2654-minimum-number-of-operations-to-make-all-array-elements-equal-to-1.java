class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int countOfOne = 0;

        for(int i=0; i<n; i++){
            if(nums[i]==1){
                countOfOne++;
            }
        }

        if(countOfOne >0){
            return n-countOfOne;
        }


        int operationsToGetFirstOne = Integer.MAX_VALUE;

        for(int i=0 ; i<n-1; i++){
            int gcd = nums[i];

            for(int j=i+1; j<n; j++){
                gcd = findGCD(gcd, nums[j]);
                if(gcd==1){
                    operationsToGetFirstOne = Math.min(operationsToGetFirstOne, j-i);
                    break;
                }
            }
        } 

        if(operationsToGetFirstOne == Integer.MAX_VALUE){
            return -1;
        }  

        return operationsToGetFirstOne + (n-1);
    }

    public int findGCD(int a , int b){
        if(b==0){
            return a;
        }
        else{
            return findGCD(b, a%b);
        }
    }
}