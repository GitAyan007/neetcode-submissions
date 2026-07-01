class Solution {

    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot_index = -1;

        for(int i=n-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                pivot_index = i-1;
                break;
            }
        }

        if(pivot_index >=0){
            int swap_index  = n-1;
            for(int i=pivot_index+1; i<n; i++){
                if(nums[i] <= nums[pivot_index]){
                    swap_index = i-1;
                    break;
                }
            }

            swap(nums, pivot_index, swap_index);
        }

        reverse(nums, pivot_index+1, n-1);
    }
}