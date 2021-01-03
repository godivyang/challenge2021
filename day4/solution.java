/*
2091 / 2091 test cases passed.
Status: Accepted
Runtime: 3 ms
Memory Usage: 40.3 MB
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer=new ArrayList<Integer>();
		int one=0;
		int two=0;
		if(nums1.length==0) {
			if(nums2.length==0) {
				return 0.0;
			}else {
				for(int i=0;i<nums2.length;i++) {
					answer.add(nums2[i]);
				}
			}
		}else if(nums2.length==0){
			for(int i=0;i<nums1.length;i++) {
				answer.add(nums1[i]);
			}
		}
		else {
			while(true) {
				if(nums1[one]<=nums2[two]) {
					answer.add(nums1[one]);
					if(one==nums1.length-1) {
						if(two!=nums2.length-1) {
							for(int i=two;i<nums2.length;i++) {
								answer.add(nums2[i]);
							}
							break;
						}else {
							answer.add(nums2[two]);
							break;
						}
					}
					one++;
				}else {
					answer.add(nums2[two]);
					if(two==nums2.length-1) {
						if(one!=nums1.length-1) {
							for(int i=one;i<nums1.length;i++) {
								answer.add(nums1[i]);
							}
							break;
						}else {
							answer.add(nums1[one]);
							break;
						}
					}
					two++;
				}
			}
		}
		int median=answer.size();
		double ans=median/2.0;
		if(ans%1!=0) {
			return answer.get((int) (ans-0.5));
		}else {
			double newans=(answer.get((int) ((ans)))+answer.get((int) ((ans)-1)))/2.0;
			return newans;
		}
  }
}
