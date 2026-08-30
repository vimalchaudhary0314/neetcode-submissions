class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        int count = 0;
        int prefix = 0;
        for(int num : nums){
            prefix += num;
            if(hs.containsKey(prefix - k)){
                count += hs.get(prefix - k); 
            }
            hs.put(prefix,hs.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}