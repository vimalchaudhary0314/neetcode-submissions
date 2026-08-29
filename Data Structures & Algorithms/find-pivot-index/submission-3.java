class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefixSum[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
        for(int j = 0; j < n; j++){
            int leftSum = prefixSum[j];
            int rightSum = prefixSum[n] - prefixSum[j+1];
            if(leftSum == rightSum){
                return j;
            }
        }
        return -1;
    }
}