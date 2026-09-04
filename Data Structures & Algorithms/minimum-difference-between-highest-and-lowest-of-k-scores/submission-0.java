class Solution {
    public int minimumDifference(int[] nums, int k) {
     Arrays.sort(nums);
     int l = 0;
     int r = k - 1;
     int min_Diff = Integer.MAX_VALUE;
     while(r < nums.length){
        min_Diff = Math.min(min_Diff, nums[r] - nums[l]);
        l++;
        r++;
        }  
        return min_Diff;
    }
}