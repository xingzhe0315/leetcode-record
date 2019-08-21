package com.xingzhe.leetcode.linked;


import java.util.Arrays;

import static com.xingzhe.leetcode.linked.LinkedListUtil.constructListNode;
import static com.xingzhe.leetcode.linked.LinkedListUtil.printListNode;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// Example:
//
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
//
//
public class AddTwoNumbers {


    public static void main(String[] args) {
        ListNode l1 = constructListNode(Arrays.asList(2, 4, 3));
        ListNode l2 = constructListNode(Arrays.asList(5, 6, 4));
        System.out.print("l1 : ");
        printListNode(l1);
        System.out.print("l2 : ");
        printListNode(l2);
        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("result : ");
        printListNode(result);

        ListNode l11 = constructListNode(Arrays.asList(1));
        ListNode l22 = constructListNode(Arrays.asList(9, 9, 9));
        System.out.print("l11 : ");
        printListNode(l11);
        System.out.print("l22 : ");
        printListNode(l22);
        ListNode result1 = addTwoNumbers(l11, l22);
        System.out.print("result1 : ");
        printListNode(result1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        ListNode current1 = l1;
        ListNode current2 = l2;

        ListNode currentResilt = null;
        int valueToUp = 0;
        for (; ; ) {
            int resultValue = 0;
            if (current1 == null && current2 == null) {
                if (valueToUp != 0) {
                    currentResilt.next = new ListNode(valueToUp);
                }
                break;
            }
            if (current1 == null) {
                resultValue = current2.value;
                current2 = current2.next;
            } else if (current2 == null) {
                resultValue = current1.value;
                current1 = current1.next;
            } else {
                resultValue = current1.value + current2.value;
                current1 = current1.next;
                current2 = current2.next;
            }

            resultValue += valueToUp;
            valueToUp = resultValue / 10;
            int realValue = resultValue % 10;
            if (resultNode == null) {
                resultNode = new ListNode(realValue);
                currentResilt = resultNode;
            } else {
                currentResilt.next = new ListNode(realValue);
                currentResilt = currentResilt.next;
            }
        }
        return resultNode;
    }
}
