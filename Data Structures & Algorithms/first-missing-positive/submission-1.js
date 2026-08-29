class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    firstMissingPositive(nums) {
        const numSet = new Set(nums);
        let missing = 1;
        while (numSet.has(missing)) {
            missing++;
        }

        return missing;
    }
}
