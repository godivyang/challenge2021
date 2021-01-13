/*
318 / 318 test cases passed.
Status: Accepted
Runtime: 2115 ms
Memory Usage: 43.3 MB
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(nums.length<3) return ans;
        ArrayList<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            c.add(nums[i]);
        Collections.sort(c);
        int i=c.size()-1;
        while(i>=0) {
        	int one=c.get(i);
        	c.remove(i);
        	ArrayList<ArrayList<Integer>> add=threeSumHelp(c,one*-1);
        	if(add==null) {
        		i--;
        		continue;
        	}
        	else {
        		for(int itr=0;itr<add.size();itr++) {
                    if(ans.contains(add.get(itr))) continue;
        			ans.add(add.get(itr));
        		}
        		i--;
        		continue;
        	}
        }
        return ans;
    }
	public ArrayList<ArrayList<Integer>> threeSumHelp(ArrayList<Integer> a,int in) {
		if(a.size()==0) return null;
		int l=0;
		int r=a.size()-1;
		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
		while(r>l) {
			ArrayList<Integer> b=new ArrayList<Integer>();
			int check=a.get(l)+a.get(r);
			if(check==in) {
				b.add(a.get(l));b.add(a.get(r));b.add(in*-1);
				Collections.sort(b);
				ans.add(b);
			}
			if(check>in) {
				r--;
				continue;
			}else {
				l++;
				continue;
			}
		}
		return ans;
	}
}
