class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number}
     */
    longestOnes(nums, k) {
        let left = 0;
        let count_Zero = 0;
        let max_Count = 0;

        for(let right = 0; right < nums.length; right++){
            if(nums[right] === 0){
                count_Zero++;
            }
            if(count_Zero > k){
                if(nums[left] === 0){
                    count_Zero--;
                }
                left++;
            }
            max_Count = Math.max(max_Count, right - left + 1);
        }
        return max_Count;
    }
}
