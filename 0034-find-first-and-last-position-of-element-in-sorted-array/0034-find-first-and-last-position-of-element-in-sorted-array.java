class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOcc = findFirst(nums, target);
        int lastOcc = findLast(nums, target);
        return new int[]{firstOcc, lastOcc};
    }

    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;      // store answer
                end = mid - 1;    // keep searching left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;       // store answer
                start = mid + 1;  // keep searching right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
}
