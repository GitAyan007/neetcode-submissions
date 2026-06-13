class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;

        Map<Integer, Integer>mp = new HashMap<>();

        for(int n : nums){
            mp.put(n, mp.getOrDefault(n,0)+1);
        }

        for(int val : mp.values()){
            if(val > 1) return true;
        }

        return false;
    }
}