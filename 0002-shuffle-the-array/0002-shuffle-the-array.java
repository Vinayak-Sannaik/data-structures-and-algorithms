class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for(int i = 0; i < n ; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i + (n)];
            // in first itaration 
            //     0,1
            //     2,3
            //     4,5
        }
        return ans;
    }
}


// basically they are givem a array consisting of two arrays 
// x array length is 0 to n-1;
// y array length is n to arry.length - 1;

// My work is to:
//     run a loop:
//         ans[i] = arr[i]
