class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m= t.length();
        if(n < m) return "";

        int minLength = Integer.MAX_VALUE, start=0, left=0;

        Map<Character, Integer> target = new HashMap<>();
        for(int i=0; i<m; i++){
            char c = t.charAt(i);
            target.put(c, target.getOrDefault(c,0)+1);
        }

        int total = target.size(), found = 0;
        Map<Character, Integer> window = new HashMap<>();
        for(int right = 0; right<n; right++){
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c,0)+1);

            if(target.containsKey(c) && target.get(c) == window.get(c)) found++;

            int length = (right - left) +1;

            while(found == total){
                if(length < minLength){
                    minLength = length;
                    start = left;
                }

                char leftOver = s.charAt(left);
                left++;
                window.put(leftOver, window.getOrDefault(leftOver,0)-1);

                if(target.containsKey(leftOver) && window.get(leftOver) < target.get(leftOver)) found--;

                length = (right - left) +1;
            } 
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
