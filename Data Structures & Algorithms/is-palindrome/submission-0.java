class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        boolean isSame = true;
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isSame = false;
                break;
            }
            left++;
            right--;
        }
        if(isSame){
            return true;
        }
        else{
            return false;
        }
    }
}
