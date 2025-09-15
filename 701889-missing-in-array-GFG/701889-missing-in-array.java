class Solution {
    long missingNum(int arr[]) {
        // code here
        
        
        // int n = arr.length;
        // long sumOfAllInteger = 0;
        // sumOfAllInteger = (n + 1) * ( n + 2) /2;  // 4 * 2 = 8
        
        // long sum = 0;
        // for(int i = 0; i<n; i++) sum += arr[i];
        
        // long result = sumOfAllInteger - sum;
        
        // return result;
        
        // int length = arr.length;
        
        // for(int i = 0 ; i < length+1; i++){
          
        //     if(arr[i] != i+1){
        //         return i+1;
        //     }
        // }
        
        // return -1;
        
        int n = arr.length;
long expectedSum = (long)(n + 1) * (n + 2) / 2;  
long actualSum = 0;

for (int i = 0; i < n; i++) {
    actualSum += arr[i];
}

return (int)(expectedSum - actualSum);

    }                     
} 
