package com;

/**
 * Created by zy on 6/8/15.
 */
public class Node<T> {
    Node next = null;
    T data;

    public Node(T data){
        this.data = data;
    }

    public boolean hasNext(){
        return next != null;
    }

    public void appendToTail(Object item){
        Node node = new Node(item);
        Node p = this;
        while (p.hasNext())
            p = p.next;
        p.next = node;
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

    public boolean equals(Node node){
        Node p1 = this, p2 = node;

        while (p1!=null && p2!=null){
            if (p1.data != p2.data)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        if (p2!=null || p1!=null)
            return false;

        return true;
    }

    public Object getData(){
        return data;
    }
}
