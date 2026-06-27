class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;

        int start=0,end=0;

        int index=0;
        nums[index]=nums[start];
        index++;

        while(end<n){
            while(end<n && nums[start]==nums[end])end++;

            if(end<n){
                nums[index]=nums[end];
                index++;
                start=end;
            }
        }

        return index;
    }
}