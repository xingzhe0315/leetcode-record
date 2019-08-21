package com.xingzhe.leetcode.linked;

import java.util.Arrays;

/**
 * author : xingzhe
 * date: 2019/8/21/0021
 */
public class ReverseSingleLinkedList {
    public static void main(String[] args){
        ListNode originListNode = LinkedListUtil.constructListNode(Arrays.asList(1, 3, 6, 8, 3, 4, 9, 2));
        LinkedListUtil.printListNode(originListNode);
        ListNode reversedList = reverseLinkedList(originListNode);
        LinkedListUtil.printListNode(reversedList);
    }

    public static ListNode reverseLinkedList(ListNode originList){
        ListNode currentNode = originList;
        ListNode prevNode=null;
        ListNode nextNode=null;
        while (currentNode.next!=null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        currentNode.next = prevNode;
        return currentNode;
    }

}
