class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_count = 0;
        for(int l = 0; l < nums.length; l++){
            int count_zero = 0;
            for(int r = l; r < nums.length; r++){
                if(nums[r] == 0){
                    count_zero++;
                }
                if(count_zero > k){
                    break;
                }
                max_count = Math.max(max_count, r - l + 1);
            }
        }
        return max_count;
    }
}