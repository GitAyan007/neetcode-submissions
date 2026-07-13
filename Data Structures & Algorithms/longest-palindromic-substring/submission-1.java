class Solution {

    private int check(String s, int left, int right){
        int len=0;

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            len = right -left +1;
            left--;
            right++;
        }

        return len;
    }

    public String longestPalindrome(String s) {
        
        int n=s.length();
        if(n==1) return s;

        int start=0,maxlen=0;

        for(int i=0; i<n; i++){
            int ln1 = check(s,i,i);
            int ln2 = check(s,i,i+1);

            int len = Math.max(ln1,ln2);

            if(len>maxlen){
                maxlen = len;
                start = i - (len-1)/2;
            }
        }

        return s.substring(start, start+maxlen);
    }
}
