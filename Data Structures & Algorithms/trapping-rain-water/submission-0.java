class Solution {
    //using two pointers
    public int trap(int[] height) {
        int n = height.length;
        int left=0,right=n-1;

        int ans=0;
        int leftMax=height[left],rightMax=height[right];

        while(left<right){
            if(leftMax<rightMax){
                ans+=leftMax-height[left] *1;
                left++;
                leftMax = Math.max(leftMax,height[left]);
            }else{
                ans+=rightMax-height[right] *1;
                right--;
                rightMax = Math.max(rightMax,height[right]);
            }
        }

        return ans;
    }
}
