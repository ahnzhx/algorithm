package leetCode;



// TODO: 푸는중
public class AddTwoNumbers {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    int listNodeToNumber(ListNode listNode){
        int k = 1;
        int listNodeNumber = 0 ;
        while(listNode != null){
            int ln  = listNode.val;
            listNodeNumber += ln * k;
            listNode = listNode.next;
            k *= 10;
        }
        return listNodeNumber;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstNum = listNodeToNumber(l1);
        int secondNum = listNodeToNumber(l2);

        int sum = firstNum + secondNum;

        ListNode rts = new ListNode(0);
        ListNode answer = rts;
        while(sum > 0){
            ListNode temp = new ListNode(sum % 10);
            answer.next = temp;
            answer =answer.next;

            sum /= 10;
        }



        return answer.next;
    }
}
