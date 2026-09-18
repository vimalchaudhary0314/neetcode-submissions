class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {void} Do not return anything, modify nums in-place instead.
     */
    rotate(nums: number[], k: number): void {
        let n = nums.length;

        k %= n;

        while(k > 0){
            let temp = nums[n-1];
            for(let i = n-1; i > 0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }
}
