class Solution {
    public int maxArea(int[] height) {
       int area=0;
        int right = height.length-1;
        int left=0;
        while(left<right)
        {
            int hei=Math.min(height[left],height[right]);
            int bre=right-left;
            area=Math.max(area,bre*hei);
            if(height[left]<height[right])
            left++;
            else
            right--;
        }
        return area;

            

        
        
    }
}