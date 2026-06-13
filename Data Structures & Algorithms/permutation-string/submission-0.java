class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        
        if(n>m) return false;

        Map<Character, Integer>mp1 = new HashMap<>();
        Map<Character, Integer>mp2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            mp1.put(c, mp1.getOrDefault(c,0)+1);
        }

        for(int i =0 ; i<n; i++){
            char c = s2.charAt(i);
            mp2.put(c, mp2.getOrDefault(c,0)+1);
        }

        if(mp1.equals(mp2)) return true;

        for(int i =n; i<m; i++){
            char add = s2.charAt(i);
            char remov = s2.charAt(i - n); // to get value which will be removed from front

            mp2.put(add, mp2.getOrDefault(add,0)+1);
            mp2.put(remov, mp2.getOrDefault(remov,0)-1);

            if(mp2.get(remov) <= 0) mp2.remove(remov);

            if(mp1.equals(mp2)) return true;
        }

        return false;
    }
}
