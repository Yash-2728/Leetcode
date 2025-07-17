/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    var n = nums.length;
    var i;
    for( i=n-2; i>=0; i--){
        if(nums[i]<nums[i+1]){
            break;
        }
    }

    if(i>=0){
        for(var j = n-1; j>i; j--){
            if(nums[i]<nums[j]){
                swap(nums, i, j);
                break;
            }
        }
    }

    reverseTheArray(nums, i+1, n-1);
};

function swap(nums, i, j){
    var temp= nums[i];
    nums[i]= nums[j];
    nums[j] = temp;
}

function reverseTheArray(nums, l, r){
    while(l<r){
        swap(nums, l++, r--);
    }
}