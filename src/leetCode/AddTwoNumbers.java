package leetCode;


public class AddTwoNumbers {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
		ListNode node = answer;
		int carry = 0; 
		
		// 왜냐면 l1이 3자리, l2 가 4자리 일 수 있음
		while(l1 != null || l2 != null ) {
			int sum = carry; 
					
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			
			carry = sum / 10;
			sum %= 10;
			ListNode temp = new ListNode(sum);
			node.next = temp;
			node = node.next;
		}
		if(carry > 0) {
			ListNode temp = new ListNode(carry);
			node.next = temp;
		}
		
		return answer.next;
    }
}
