class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
                    char[] ch = str.toCharArray();
                    Arrays.sort(ch);
                    return String.valueOf(ch);
                }))
                .values()

        );

        /*Map<String, List<String>> hash = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortKey = String.valueOf(ch);
            if(!hash.containsKey(sortKey)){
                hash.put(sortKey,new ArrayList<>());
            }
            hash.get(sortKey).add(str);
        }
        return new ArrayList<>(hash.values());*/
    }
}
