class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int left=0,maxCheck=Integer.MIN_VALUE;

        ArrayList<Integer> window = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        

        for(int right =0; right<nums.length; right++){
            int val = nums[right];
            window.add(val);
            maxCheck = Math.max(maxCheck, val);
        
            if(window.size() >= k){
                ans.add(maxCheck);
                
                val = nums[left];
                window.remove((Integer)val);
                left++;
                if (val == maxCheck) {

                    maxCheck = Integer.MIN_VALUE;

                    for (int num : window) {
                        maxCheck = Math.max(maxCheck, num);
                    }
                }
            }
        }

        int[] Finalans = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            Finalans[i] = ans.get(i);
        }
        return Finalans;
    }
}
