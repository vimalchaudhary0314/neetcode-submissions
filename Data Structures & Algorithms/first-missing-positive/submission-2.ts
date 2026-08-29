class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    firstMissingPositive(nums: number[]): number {
        const numSet = new Set<number>(nums);

        let missing = 1;
        // Increment until the missing number is found
        while (numSet.has(missing)) {
            missing++;
        }

        return missing;
    }
}
