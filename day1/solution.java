/*
52 / 52 test cases passed.
Status: Accepted
Runtime: 2 ms
Memory Usage: 39.2 MB
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};
        int counter=0;
        ArrayList<Integer> counterNums = new ArrayList<Integer>();
        ArrayList<Integer> sample1 = new ArrayList<Integer>();
        ArrayList<Integer> sample2 = new ArrayList<Integer>();
        if(nums.length==2) {
        	ans[0]=0;
        	ans[1]=1;
        	return ans;
        }
        for(int i:nums) {
        	sample1.add(i);
        	if(i==target/2) {
        		counter++;
        		counterNums.add(sample1.size()-1);
        	}
        	if(counter==2) {
        		ans[0]=counterNums.get(0);
        		ans[1]=counterNums.get(1);
        		return ans;
        	}
        	int a = target - i;
        	sample2.add(a);
        }
        for(int j:sample2) {
        	if(sample1.contains(j)) {
        		ans[0]=sample1.indexOf(target-j);
        		ans[1]=sample1.indexOf(j);
        		if (ans[0]==ans[1])
        			continue;
        		return ans;
        	}
        }
		return ans;
    }
}
