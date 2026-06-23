class Solution {

    private boolean helperCheck(String s, int left, int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        if(s.length() <=1) return true;

        int left=0, right=s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return helperCheck(s,left+1,right) || helperCheck(s,left,right-1);
            }

            left++;
            right--;
        }   

        return true;
    }
}