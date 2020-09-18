package _2两数相加;

public class Solution {

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
