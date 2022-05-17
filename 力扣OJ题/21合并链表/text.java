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
 // 核心思路：创建一个虚拟节点，每次比较两个链表比较小的数字，采用尾插法插到虚拟节点后面
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while ((list1 != null)&&(list2 != null)) {
            if(list1.val <= list2.val) {
                tmp.next = list1;
                list1 = list1.next;
                tmp = tmp.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
                tmp = tmp.next;
            }
        }
        // 跳出循环以后，可能只有一个链表空了，应该将不为空的连接到后面
       while (list1 != null) {
           tmp.next = list1;
            tmp = tmp.next;
           list1 = list1.next;
       }
        while (list2 != null) {
           tmp.next = list2;
           tmp = tmp.next;
           list2 = list2.next;
       }
       return newHead.next;
    }
}