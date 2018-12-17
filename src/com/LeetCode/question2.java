package com.LeetCode;

/*给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

*/
public class question2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), cuur = head;

        //计算出每一位的值并且判断是否有进位
        int hasCarry = 0;
        while (true){
            int bit = l1.val + l2.val + hasCarry;
            hasCarry = 0;
            if (bit > 9){
                bit -= 10;
                hasCarry = 1;
            }
            cuur.next = new ListNode(bit);
            cuur = cuur.next;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null && l2 == null){
                if (hasCarry == 1){
                    cuur.next = new ListNode(1);
                }
                break;
            }
            else if (l1 == null && l2 != null ){
                l1 = new ListNode(0);
            }
            else if (l1 != null && l2 == null){
                l2 = new ListNode(0);
            }
        }

        return head.next;
    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    ListNode(int x , ListNode a){
        val = x;
        next = a;
    }
 }
