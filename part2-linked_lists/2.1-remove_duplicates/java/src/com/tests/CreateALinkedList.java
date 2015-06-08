package com.tests;

import com.Node;

/**
 * Created by zy on 6/8/15.
 */
public class CreateALinkedList {
    static public Node create(int len){
        Node head = new Node(0);

        Node p = head;
        for (int ii=1; ii<len; ii++)
            p.appendToTail(new Node(ii));
        return head;
    }
}
