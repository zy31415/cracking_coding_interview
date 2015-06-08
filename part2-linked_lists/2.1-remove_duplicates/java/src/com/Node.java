package com;

/**
 * Created by zy on 6/8/15.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int data){
        this.data = data;
    }

    boolean hasNext(){
        return next != null;
    }

    public void appendToTail(Node node){
        Node p = this;
        while (p.hasNext())
            p = p.next;
        p.next = node;
    }

    public void print(){
        Node p = this;
        while (p.hasNext()){
            System.out.printf(p.data + " -> ");
            p = p.next;
        }

        System.out.println(p.data + "\n");
    }

    public Node getNext() {
        return next;
    }

    public void deleteNext(){
        if (hasNext()) {
            Node deleted = next;
            next = next.next;
            deleted.next = null;
        }
    }

    public void setData(int data){
        this.data = data;
    }

}
