package com;

/**
 * Created by zy on 6/9/15.
 */
public class Stack<T> {
    Node<T> top;

    public Stack(){
        top = null;
    }

    public void push(Node<T> item){
        item.next = top;
        top = item;
    }

    public Node<T> pop(){
        if (top!=null){
            Node out = top;
            top = out.next;
            return out;
        }
        return null;
    }

}
