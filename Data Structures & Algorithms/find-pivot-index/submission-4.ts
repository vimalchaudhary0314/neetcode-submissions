class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    pivotIndex(nums: number[]): number {
        let prefixSum: number[] = [];
        let n = nums.length;

        prefixSum[0] = 0;

        for (let i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (let j = 0; j < n; j++) {
            let leftSum = prefixSum[j];
            let rightSum = prefixSum[n] - prefixSum[j + 1];

            if (leftSum === rightSum) {
                return j;
            }
        }

        return -1;
    }
}
