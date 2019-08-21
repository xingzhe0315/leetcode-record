package com.xingzhe.leetcode.linked;

import java.util.List;

/**
 * author : xingzhe
 * date: 2019/8/21/0021
 */
public class LinkedListUtil {
    public static ListNode constructListNode(List<Integer> list) {
        ListNode head = null;
        ListNode current = null;
        for (Integer integer : list) {
            if (head == null) {
                head = new ListNode(integer);
                current = head;
            } else {
                current.next = new ListNode(integer);
                current = current.next;
            }
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder("[");
        while (head != null) {
            stringBuilder.append(head.value).append(",");
            head = head.next;
        }
        if (stringBuilder.length() > 2) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}
