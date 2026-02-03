class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2*size];

        for(int i = 0; i < size*2; i++){
            // if(i >= size){
            //     ans[i] = nums[i-size];
            // }else{
            //     ans[i] = nums[i];
            // }
            ans[i] = nums[i%size];
            // 0 = 0%3[0]
            // 1 = 1%3[1]
            // 2 = 2%3[2]
            // 3 = 3%3[0]
            // 4 = 4%3[1]
        }
        return ans;
    }
}

