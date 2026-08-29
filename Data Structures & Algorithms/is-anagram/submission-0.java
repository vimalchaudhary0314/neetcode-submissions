class Solution {
    public boolean isAnagram(String s, String t) {
        boolean anagram = false;
         char[]chs = s.toCharArray();
         char[]cht = t.toCharArray();

          Arrays.sort(chs);
         Arrays.sort(cht);
         if(Arrays.equals(chs,cht)){
            anagram = true;
         }
        return anagram;
    }
}
