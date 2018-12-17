package com.LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class question2Test {
    question2 Q2 = new question2();

    ListNode L13 = new ListNode(3);
    ListNode L12 = new ListNode(4,L13);
    ListNode L1 = new ListNode(2,L12);

    ListNode L23 = new ListNode(4);
    ListNode L22 = new ListNode(6,L23);
    ListNode L2 = new ListNode(5,L22);

    ListNode L33 = new ListNode(8);
    ListNode L32 = new ListNode(0,L33);
    ListNode L31 = new ListNode(7,L32);

    @Test
    void addTwoNumbers() {
        assertEquals(L31 , Q2.addTwoNumbers(L1,L2));
    }

    @Test
    void getLastNode() {
        assertEquals(L13,Q2.getLastNode(L1));
    }
}