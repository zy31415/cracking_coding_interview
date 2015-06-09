package com;

import java.util.Hashtable;

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

    public void removeDuplicates(){
        Node p1 = this, runner, previous;

        while (p1.hasNext()){
            previous = p1;
            runner = p1.getNext();

            while (runner!=null){
                if (p1.data == runner.data){
                    previous.deleteNext();
                }
                else
                    previous = runner;
                runner = previous.next;
            }

            if (p1.hasNext())
                p1 = p1.next;
        }
    }

    public void removeDuplicatesHashtable(){
        if (!this.hasNext())
            return;

        Node previous = this, p = this.next;
        Hashtable ht = new Hashtable();

        ht.put(previous.data, true);

        while(p!=null){
            if (ht.containsKey(p.data)){
                p = p.next;
                previous.deleteNext();
            } else {
                ht.put(p.data, true);
            }
            previous = p;
            if (p!=null)
                p = p.next;
        }
    }

}
