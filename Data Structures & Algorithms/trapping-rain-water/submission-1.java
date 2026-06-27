class Solution {
    //using two pointers
    public int trap(int[] height) {
        int n = height.length;
        int left=0,right=n-1;

        int ans=0;
        int leftMax=height[left],rightMax=height[right];

        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                ans+=leftMax-height[left] *1;
            }else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                ans+=rightMax-height[right] *1;
            }
        }

        return ans;
    }
}
