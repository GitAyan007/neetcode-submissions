class Solution {

    private int findBounds(int[] nums, int target, boolean first){
        int n= nums.length;
        int start=0,end=n-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                if(first){
                    if(mid==0 || nums[mid-1]!= target) return mid;
                    else end=mid-1;
                }else{
                    if(mid==n-1 || nums[mid+1] != target) return mid;
                    else start = mid+1;
                }
            }else if(nums[mid] > target){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstOcur = findBounds(nums,target,true);

        if(firstOcur == -1) return new int[]{-1,-1};

        int lastOcur = findBounds(nums,target, false);

        return new int[]{firstOcur, lastOcur};
    }
}