class Solution {

    //modified vertical search
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        // finding the smallest string
        String smallest = strs[0];
        for(int i=1; i<strs.length; i++){
 
            if( strs[i].length() < smallest.length()) smallest = strs[i];
        } 

        //vertical search -> here the initial prefix is now the smallest string to avoid extra length check on each string
        for(int i=0; i<smallest.length(); i++){
            char c = smallest.charAt(i);

            for(String s : strs){
                if(s.charAt(i) != c) return smallest.substring(0,i);
            }
        }

        return smallest;
    }
}