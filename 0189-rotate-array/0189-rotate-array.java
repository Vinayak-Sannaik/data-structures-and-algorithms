// class Solution {
//     public void rotate(int[] nums, int k) {
//         int start = nums.length - k;

//         int[] firstHalf = new int[k];
//         int count = 0;
//         for  (int i = start ; i < nums.length ; i++){
//             firstHalf[count] = nums[start];
//             count++;
//         }
//         int[] secondHalf = new int[start];

//     } 
// }

// 0 1 2 3 4 5 6 
// 1,2,3,4,5,6,7

class Solution {
    static void reverse(int[] nums, int startIndex, int lastIndex){
        while(startIndex < lastIndex){
            int temp = nums[startIndex];
            nums[startIndex] = nums[lastIndex];
            nums[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length; 
        k = k % n;           
		reverse(nums, n - k, n - 1);
		reverse(nums, 0, n- k -1);
		reverse(nums, 0, n-1);
    }
}