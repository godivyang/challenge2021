/*
131 / 131 test cases passed.
Status: Accepted
Runtime: 7 ms
Memory Usage: 39.4 MB
*/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(target-ans);
        Arrays.sort(nums);
        int itr=nums.length-1;
        while(itr>=0) {
        	if(itr!=nums.length-1 && nums[itr]==nums[itr+1]) continue;
        	int t=target-nums[itr];
        	nums=Arrays.copyOf(nums, itr);
        	if(nums.length<2) {
        		return ans;
        	}
        	int checker=threeSumClosestHelp(nums,t);
        	if(Math.abs(t-checker)<diff) {
        		diff=Math.abs(t-checker);
        		ans=checker+target-t;
        		itr--;
        	}else {
        		itr--;
        		continue;
        	}
        }
        return ans;
    }
    public int threeSumClosestHelp(int[] nums, int target) {
    	if(nums.length==2) return nums[1]+nums[0];
    	int itr1=0;
    	int itr2=nums.length-1;
    	int sum=nums[itr1]+nums[itr2];//33
    	int diff=Math.abs(target-sum);//15
    	int ans=sum;
    	while(itr1<itr2) {
    		sum=nums[itr1]+nums[itr2];
    		if(Math.abs(target-sum)<diff) {
    			if(nums.length==5) System.out.println(target-sum);
    			diff=Math.abs(target-sum);
    			ans=sum;
    			if(sum>target) itr2--;
    			else itr1++;
    		}else if(Math.abs(target-sum)>diff) {
    			itr2--;
    		}else {
    			if(sum>target) itr2--;
    			else itr1++;
    		}
    	}
    	return ans;
    }
}
