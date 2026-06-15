class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==  0) return 0;
        int left=0, ans=0;

        //based on the question it seems like it contains other characters
        int[] freq = new int[128];
        
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            freq[c]++;
            int length = (right-left)+1;

            //move the window
            while(freq[c] > 1){
                char c1 = s.charAt(left);
                freq[c1]--;

                left++;
                length = (right-left)+1;
            }

            ans = Math.max(ans, length);
        }
        return ans;
    }
}
