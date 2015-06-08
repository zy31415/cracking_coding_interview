package com;

/**
 * Created by zy on 6/8/15.
 */
public class LinkedList {
    static public void removeDuplicates(Node node){
        Node p1 = node, p2, previous;

        while (p1.hasNext()){
            previous = p1;
            p2 = p1.getNext();

            while (p2!=null){
                if (p1.data == p2.data){
                    previous.deleteNext();
                }
                else
                    previous = p2;
                p2 = previous.getNext();
            }

            if (p1.hasNext())
                p1 = p1.getNext();
        }
    }
}
