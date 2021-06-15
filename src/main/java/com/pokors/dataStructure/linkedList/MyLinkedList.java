package com.pokors.dataStructure.linkedList;

/**
 * 链表
 *
 * @author andrew.liuhp@foxmail.com
 * @version V1.0
 * @since 2021/5/30 11:34
 */
public class MyLinkedList {

    /**
     * 头节点指针
     */
    private Node head;
    /**
     * 尾节点指针
     */
    private Node tail;
    /**
     * 链表实际长度
     */
    private int size;

    /**
     * 链表节点
     */
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
