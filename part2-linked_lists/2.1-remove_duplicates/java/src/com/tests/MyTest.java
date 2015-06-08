package com.tests;

import com.LinkedList;
import com.Node;
import org.junit.Test;

/**
 * Created by zy on 6/8/15.
 */
public class MyTest {
    @Test
    public void testNodeInitialization(){
        Node node = new Node(10);
    }

    @Test
    public void testAppendToTail(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.appendToTail(node2);
        node1.appendToTail(node3);

        //node1.print();
    }

    @Test
    public void testPrint(){
        Node node = new Node(10);
        // node.print();
    }

    @Test
    public void testCreateALinkedList(){
        Node node = CreateALinkedList.create(10);
        // node.print();
    }

    @Test
    public void testDeleteNext(){
        Node node = CreateALinkedList.create(10);
        node.deleteNext();
        // node.print();
    }

    @Test
    public void testDeleteNext2(){
        Node node = CreateALinkedList.create(1);
        node.deleteNext();
        // node.print();
    }

    @Test
    public void testRemoveDuplicates(){
        Node node = CreateALinkedList.create(10);

        node.getNext().getNext().getNext().getNext().getNext().setData(1);

        node.print();

        LinkedList.removeDuplicates(node);

        node.print();
    }

    @Test
    public void testRemoveDuplicates2(){
        Node node = CreateALinkedList.create(4);

        node.getNext().getNext().getNext().setData(0);

        node.print();

        LinkedList.removeDuplicates(node);

        node.print();
    }

    @Test
    public void testRemoveDuplicates3(){
        Node node = CreateALinkedList.create(4);

        node.getNext().getNext().getNext().setData(1);

        node.print();

        LinkedList.removeDuplicates(node);

        node.print();
    }

    @Test
    public void testRemoveDuplicates4(){
        Node node = new Node(0);

        for (int ii=0; ii<5; ii++){
            node.appendToTail(new Node(5));
        }

        node.print();

        LinkedList.removeDuplicates(node);

        node.print();
    }

    @Test
    public void testRemoveDuplicates5(){
        Node node = new Node(0);

        for (int ii=0; ii<5; ii++){
            node.appendToTail(new Node(0));
        }

        node.print();

        LinkedList.removeDuplicates(node);

        node.print();
    }
}
