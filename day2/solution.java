/*
1568 / 1568 test cases passed.
Status: Accepted
Runtime: 1 ms
Memory Usage: 39.4 MB
*/

/*
Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
*/

class Solution {
    public static int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a=0;int b=0;
		if(l1!=null)
			a=l1.val;
		if(l2!=null)
			b=l2.val;
	    int addition = a+b+carry;
		if(addition<10) {
	    	l1.val=addition;
	    	carry=0;
		}
		else {
			l1.val=addition-10;
			carry=1;
		}
		if(l1.next==null && l2.next==null) {
			if(carry!=0) {
				l1.next=new ListNode();
				l1.next.val=carry;
                carry=0;
			}
			return l1;
		}
		else {
			if(l1.next==null)
				l1.next=new ListNode();
			if(l2.next==null)
				l2.next=new ListNode();
			addTwoNumbers(l1.next,l2.next);
		}
		return l1;
    }
}
