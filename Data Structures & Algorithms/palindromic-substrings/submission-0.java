class Solution {

    private int check(String s, int left, int right){
        int count=0;
        int n =s.length();

        while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    } 

    public int countSubstrings(String s) {
        int n = s.length();
        if(n==1) return 1;

        int totalCount=0;
        
        for(int i=0; i<n; i++){
            //odd
            totalCount += check(s, i, i);
            //even
            totalCount += check(s,i,i+1);
        }

        return totalCount;
    }
}
