/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        ListNode startNode = new ListNode();
        ListNode nextNode = startNode;

        while (l1 != null || l2 != null || carry == true) {
            int thisVal = addNodes(l1,l2);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (carry) {
                thisVal++;
                carry = false;
            }
            if (thisVal >= 10) {
                thisVal -= 10;
                carry = true;
            }
            nextNode.next = new ListNode(thisVal);
            nextNode = nextNode.next;
        }
        return startNode.next;
    }

    public int addNodes(ListNode l1, ListNode l2) {
        int val1 = 0;
        int val2 = 0;

        if (l1 != null) {
            val1 = l1.val;
        }
        if (l2 != null) {
            val2 = l2.val;
        }

        return (val1 + val2);
    }
}
