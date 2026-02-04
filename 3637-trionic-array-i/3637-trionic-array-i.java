// class Solution {
//     public boolean isTrionic(int[] nums) {
//         if (nums.length < 4) {
//             return false;
//         }

//         int n = nums.length;
//         int i = 0;
//         while (i < n - 1 && nums[i] > nums[i + 1]) {
//             i++;
//         }
//         // if we are at end and i not incremented we not found increase
//         if (i == 0 || i == n - 1)
//             return false;

//         int p = i;
//         while (i < n - 1 && nums[i] < nums[i + 1]) {
//             i++;
//         }
//         if (p == i || i == n - 1)
//             return false;

//         while (i < n - 1 && nums[i] > nums[i + 1]) {
//             i++;
//         }

//         if (i == n - 1) {
//             return true;
//         } else {
//             return false;
//         }

//     }
// }

class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length < 4) return false;

        int n = nums.length;
        int i = 0;

        // 1️⃣ Increasing
        int start = i;
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == start) return false;

        // 2️⃣ Decreasing
        start = i;
        while (i < n - 1 && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == start) return false;

        // 3️⃣ Increasing
        start = i;
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == start) return false;

        return i == n - 1;
    }
}



// class Solution {
//     public boolean isTrionic(int[] nums) {
//         int n = nums.length;
//         if (n < 4) return false;

//         int i = 0;

//         while (i + 1 < n && nums[i] < nums[i+1]) {
//             i++;
//         }

//         if (i == 0 || i == n - 1) return false;

//         int p = i;
//         while (i + 1 < n && nums[i] > nums[i+1]) {
//             i++;
//         }

//         if (i == p || i == n - 1) return false;

//         while (i + 1 < n && nums[i] < nums[i+1]) {
//             i++;
//         }

//         return i == n - 1;
//     }
// }

// // check nums>= 6
// // [1,3,5,4,2,6]
// //    ||   
