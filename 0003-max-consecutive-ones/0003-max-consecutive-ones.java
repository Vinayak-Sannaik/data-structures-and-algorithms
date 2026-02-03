class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempCounter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                tempCounter++;
            }else{
                tempCounter = 0;
            }
            if(tempCounter > max){
                max = tempCounter;
            }
        }

        return max;
    }
}

    