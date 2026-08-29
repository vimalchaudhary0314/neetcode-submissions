class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1)/2;
        int missing = 0;

        for(int num : nums){
            missing += num;
        }
        return expected - missing;
    }
}
