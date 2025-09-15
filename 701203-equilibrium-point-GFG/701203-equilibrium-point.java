// class Solution {
//     public static int findEquilibrium(int arr[]) {
//         int l = 0;
//         int r = arr.length - 1;

//         int la = arr[l];
//         int ra = arr[r];

//         while (l < r) {
//             if (la < ra) {
//                 l++;
//                 la += arr[l];
//             } else if (la > ra) {
//                 r--;
//                 ra += arr[r];
//             } else { 
//                 // la == ra, shrink both sides
//                 l++;
//                 r--;
//                 if (l <= r) {  // add new values after moving pointers
//                     la += arr[l];
//                     ra += arr[r];
//                 }
//             }
//         }

//         // After loop, l == r (single index left)
//         if (la == ra) return l; // equilibrium index found
//         return -1; // no equilibrium
//     }
// }

class Solution{
    public static int findEquilibrium(int arr[]){
        int length = arr.length;
        int rightSum = 0;
        for (int i = 0; i < length; i++){
            rightSum += arr[i];
        }
        
        int leftSum = 0;
        for(int i = 0; i < length ; i++){
            rightSum = rightSum - arr[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        
        return -1;
    }
}






