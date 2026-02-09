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
    
    static void rotateArr(int arr[], int d) {
    int n = arr.length;

    if (n == 0) return;

    d = d % n;
    if (d == 0) return;

    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
}

}