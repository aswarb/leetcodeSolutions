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
  public ListNode middleNode(ListNode head) {
    int count = 0;
    ListNode node = head;

    while (node.next != null) {
      node = node.next;
      count++;
    }
    int middle;

    count++;
    if (count % 2 == 0) {
      middle = count / 2;
    } else {
      middle = (int)(count / 2);
    }

    node = head;
    for (int i = 0; i < middle; i++) {
      node = node.next;
    }
    return node;
  }
}
