class Solution {
    public boolean search(int[] nums, int target) {
        // iterartion
        int length = nums.length;
        for(int i = 0; i < length; i++){
            // compare 
            if(nums[i] == target){
                return true;
            }
        }

        return false;
        //yes return TRue or False
    }
}