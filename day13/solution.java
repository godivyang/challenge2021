/*
56 / 56 test cases passed.
Status: Accepted
Runtime: 2 ms
Memory Usage: 40.6 MB
*/
class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int l=0;int r=height.length-1;
        while(r>l) {
        	int checker=0;
        	int h=0;
        	int b=r-l;
        	if(height[l]>height[r]) {
        		h=height[r];
        		r--;
        	}
        	else {
        		h=height[l];
        		l++;
        	}
        	checker=b*h;
        	if(checker>area)
        		area=checker;
        }
        return area;
    }
}
