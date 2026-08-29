class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> hash = new TreeSet<>();
       for(int i = 0; i < nums.length; i++){
        hash.add(nums[i]);
       }
       int i = 0;
       for(int num : hash){
        nums[i++] = num;
       }
       return hash.size();
    }
}