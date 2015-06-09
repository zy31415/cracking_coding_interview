package com.tests;

import com.Node;
import com.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by zy on 6/8/15.
 */
public class MyTest {
    @Test
    public void testNodeInitialization() {
        Node node = new Node(10);
    }

    @Test
    public void testAppendToTail() {
        Node node1 = new Node(100);
        node1.appendToTail(100);
        node1.appendToTail(200);

        node1.print();
    }

    @Test
    public void testAppendToTail2() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.appendToTail(node2);
        node1.appendToTail(node3);

        node1.print();
    }

    @Test
    public void testCreateALinkedList() {
        Node node = CreateALinkedList.createSequence(10);
        node.print();
    }

//    @Test
//    public void testDeleteNext() {
//        Node node = CreateALinkedList.createSequence(10);
//        node.deleteNext();
//        // node.print();
//    }
//
//    @Test
//    public void testDeleteNext2() {
//        Node node = CreateALinkedList.createSequence(1);
//        node.deleteNext();
//        // node.print();
//    }
//
//    @Test
//    public void testEquals1() {
//        Node node1 = CreateALinkedList.createSequence(10);
//        Node node2 = CreateALinkedList.createSequence(10);
//
//        assertTrue(node1.equals(node2));
//    }
//
//    @Test
//    public void testEquals2() {
//        Node node1 = CreateALinkedList.createSequence(10);
//        Node node2 = CreateALinkedList.createSequence(3);
//
//        assertFalse(node1.equals(node2));
//        assertFalse(node2.equals(node1));
//    }
//
//    @Test
//    public void testEquals3() {
//        Node node1 = new Node(0);
//        Node node2 = new Node(0);
//        Node node3 = new Node(1);
//
//        assertTrue(node1.equals(node2));
//        assertFalse(node1.equals(node3));
//    }
//
//    @Test
//    public void testCreat() {
//        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Node node = CreateALinkedList.create(arr);
//        //node.print();
//    }

    @Test
    public void testStack(){
        Stack stack = new Stack();

        for (int ii=0; ii<10; ii++){
            Node node = new Node(ii);
            stack.push(node);
        }

        for (int ii=0; ii<10; ii++){
            Node node = stack.pop();
            assertEquals(9 - ii, node.getData());
        }
    }

    @Test
    public void testStack2(){
        // test null cases:
        Stack stack = new Stack();

        assertEquals(null, stack.pop());
    }

    @Test
    public void test(){

    }
}
