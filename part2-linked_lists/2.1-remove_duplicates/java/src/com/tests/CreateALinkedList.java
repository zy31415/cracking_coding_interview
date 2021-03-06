package com.tests;

import com.Node;

/**
 * Created by zy on 6/8/15.
 */
public class CreateALinkedList {
    static public Node createSequence(int len){
        Node head = new Node(0);

        Node p = head;
        for (int ii=1; ii<len; ii++)
            p.appendToTail(new Node(ii));
        return head;
    }

    static public Node create(int[] arr){
        Node head = new Node(arr[0]);
        Node p = head;
        for (int i = 1; i < arr.length; i++){
            Node end = new Node(arr[i]);
            p.appendToTail(end);
            p = end;
        }
       return head;
    }

}
