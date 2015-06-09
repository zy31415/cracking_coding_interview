package com.tests;

import com.Node;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        Node node = CreateALinkedList.createSequence(10);
        // node.print();
    }

    @Test
    public void testDeleteNext(){
        Node node = CreateALinkedList.createSequence(10);
        node.deleteNext();
        // node.print();
    }

    @Test
    public void testDeleteNext2(){
        Node node = CreateALinkedList.createSequence(1);
        node.deleteNext();
        // node.print();
    }

    @Test
    public void testEquals1(){
        Node node1 = CreateALinkedList.createSequence(10);
        Node node2 = CreateALinkedList.createSequence(10);

        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEquals2(){
        Node node1 = CreateALinkedList.createSequence(10);
        Node node2 = CreateALinkedList.createSequence(3);

        assertFalse(node1.equals(node2));
        assertFalse(node2.equals(node1));
    }

    @Test
    public void testEquals3(){
        Node node1 = new Node(0);
        Node node2 = new Node(0);
        Node node3 = new Node(1);

        assertTrue(node1.equals(node2));
        assertFalse(node1.equals(node3));
    }

    @Test
    public void testCreat(){
        int [] arr = {9,8,7,6,5,4,3,2,1};
        Node node = CreateALinkedList.create(arr);
        //node.print();
    }

    @Test
    public void testRemoveDuplicates(){
        Node node = CreateALinkedList.createSequence(10);

        node.getNext().getNext().getNext().getNext().getNext().setData(1);

        // node.print();
        //int[] arr = {0,1,2,3,4,1,6,7,8,9};
        //assertTrue(node.equals(CreateALinkedList.create(arr)));

        node.removeDuplicates();

        //node.print();
        int[] arr1 = {0,1,2,3,4,6,7,8,9};
        assertTrue(node.equals(CreateALinkedList.create(arr1)));


    }

    @Test
    public void testRemoveDuplicates2(){
        Node node = CreateALinkedList.createSequence(4);

        node.getNext().getNext().getNext().setData(0);

        node.print();

        node.removeDuplicates();

        node.print();
    }

    @Test
    public void testRemoveDuplicates3(){
        Node node = CreateALinkedList.createSequence(4);

        node.getNext().getNext().getNext().setData(1);

        node.print();

        node.removeDuplicates();

        node.print();
    }

    @Test
    public void testRemoveDuplicates4(){
        Node node = new Node(0);

        for (int ii=0; ii<5; ii++){
            node.appendToTail(new Node(5));
        }

        node.print();

        node.removeDuplicates();

        node.print();
    }

    @Test
    public void testRemoveDuplicates5(){
        Node node = new Node(0);

        for (int ii=0; ii<5; ii++){
            node.appendToTail(new Node(0));
        }

        node.print();

        node.removeDuplicates();

        node.print();
    }



    @Test
    public void testRemoveDuplicatesHashtable(){
        int[] arr1 = {1,2,3,3,5,6,7};
        Node node = CreateALinkedList.create(arr1);

        node.removeDuplicatesHashtable();

        int[] arr2 = {1,2,3,5,6,7};

        assertTrue(node.equals(CreateALinkedList.create(arr2)));

    }

    @Test
    public void testRemoveDuplicatesHashtable2(){
        int[] arr1 = {1,2,3,3};
        Node node = CreateALinkedList.create(arr1);

        node.removeDuplicatesHashtable();

        int[] arr2 = {1,2,3};

        assertTrue(node.equals(CreateALinkedList.create(arr2)));

    }
}
