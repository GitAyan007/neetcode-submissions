class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, ans=0, maxFreq=0;
        int[] arr = new int[26];

        for(int right =0; right<s.length(); right++){
            char c = s.charAt(right);
            arr[c-'A']++;

            maxFreq = Math.max(maxFreq,arr[c-'A']);
            int length = (right-left)+1;

            while(length - maxFreq > k){
                char c1 = s.charAt(left);
                arr[c1-'A']--;
                // maxFreq = Math.max(maxFreq,arr[c1-'A']);

                left++;
                length = (right-left)+1;
            }

            ans = Math.max(ans, length);
        }
        return ans;
    }
}
