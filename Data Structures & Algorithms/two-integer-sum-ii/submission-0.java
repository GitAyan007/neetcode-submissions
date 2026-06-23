class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        int left = 0, right = nums.length - 1;

        while(left < right){
            int match = nums[left] + nums[right];

            if(match > target) right--;
            else if(match < target) left++;
            else{
                ans[0]=left+1;
                ans[1]=right+1;

                break;
            }
        }

        return ans;
    }
}
