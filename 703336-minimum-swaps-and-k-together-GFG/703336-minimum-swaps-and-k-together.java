// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] <= k) count++;
        }
        
        //exam check bad in first window
        int badNumbersCount = 0;
        for(int i = 0; i < count ; i++){
            if(arr[i]>k) badNumbersCount++;
        }
        
        // now consider all the array
        int ans = badNumbersCount;
        for(int i = 0, j = count; j<n ; j++, i++){
            if(arr[i]>k) badNumbersCount--;
            if(arr[j]>k) badNumbersCount++;
            
            ans = Math.min(ans, badNumbersCount);
        }
        
         return ans;
    }
}


// 2 1 5 6 3
// 2 1 3 6 5 -> 1

// 2 7 9 5 8 7 4
// 2 4 9 5 8 7 7 -> 1
// 2 4 5[6]9 8 7 7 -> 2

// 2 4 5 3 6 1 8 1 3
// 2 4 5 3 1 6 8 1 3 -1
// 2 4 5 3 1 6 3 1 8 -2
// 2 4 5 3 1 1 3 6 8 -3

// 2 4 5 3 1 6 3 1 8 -2
// 2 4 5 3 1 1 3 6 8 -3
// we can start sorting untill the current element will less or equals to k
// start checking numbers less than k return n / 2



