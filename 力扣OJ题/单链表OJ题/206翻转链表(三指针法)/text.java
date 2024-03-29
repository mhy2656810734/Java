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
 // 核心思路: 三指针法
class Solution {
    public ListNode reverseList(ListNode head) {
 if (head == null) {
            return null;
        }
        // ListNode prev = null;
        // ListNode cur = head;
        // ListNode newHead = null;
        // while (cur != null) {
        //     ListNode curNext = cur.next;
        //     // 判断curNext是不是已经为空,为空就是新头结点
        //     if (curNext == null) {
        //         newHead = cur;
        //     } 
        //     cur.next = prev;
        //     prev = cur;
        //     cur = curNext;
        // }
        // return newHead;
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
}
}
