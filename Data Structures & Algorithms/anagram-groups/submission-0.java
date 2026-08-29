class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortKey = String.valueOf(ch);
            if(!hash.containsKey(sortKey)){
                hash.put(sortKey,new ArrayList<>());
            }
            hash.get(sortKey).add(str);
        }
        return new ArrayList<>(hash.values());
    }
}
