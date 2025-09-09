class Solution {
    static int inversionCount(int arr[]) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    private static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = 0;

        // Count inversions in left half
        count += mergeSortAndCount(arr, left, mid);

        // Count inversions in right half
        count += mergeSortAndCount(arr, mid + 1, right);

        // Count inversions while merging
        count += mergeAndCount(arr, left, mid, right);

        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0, count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1); // count all inversions at once
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }

        return count;
    }
}

