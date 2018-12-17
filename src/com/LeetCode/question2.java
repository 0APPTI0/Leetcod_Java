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
        ListNode result = new ListNode(0);
        //计算出每一位的值并且判断是否有进位
        int hasCarry = 0;
        while (true){
            int bit = l1.val + l2.val + hasCarry;
            hasCarry = 0;
            if (bit > 9){
                bit -= 10;
                hasCarry = 1;
            }
            //ListNode temp = new ListNode(bit);
            ListNode presentNode = getLastNode(result);
            presentNode.next = new ListNode(bit);
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null || l2 == null){
                break;
            }
        }

        return result.next;
    }


    //返回当前list中的最后一个节点
    public ListNode getLastNode(ListNode a){
        ListNode temp = null;
        while (a.next != null){
            temp = a.next;
        }
        return temp;
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
