package leetCode;

import junit.framework.TestCase;

public class AddTwoNumbersTest extends TestCase {

    public void test(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(4, new AddTwoNumbers.ListNode(3)));
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5, new AddTwoNumbers.ListNode(6, new AddTwoNumbers.ListNode(4)));

        AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(7, new AddTwoNumbers.ListNode(0, new AddTwoNumbers.ListNode(8)));
        assertEquals(expected, addTwoNumbers.addTwoNumbers(l1, l2));
    }

}