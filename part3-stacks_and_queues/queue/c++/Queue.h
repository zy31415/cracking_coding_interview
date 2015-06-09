//
// Created by zy on 6/9/15.
//

#ifndef QUEUE_QUEUE_H
#define QUEUE_QUEUE_H

# include<iostream>
using namespace std;

template <class T>
class Node {
private:
    Node<T>* next = NULL;
    T data;

public:
    Node(T data) : data(data), next(NULL){};
    ~Node(){}

    bool hasNext() {return next!=NULL;}

    bool hasNextNext(){
        return hasNext() && next->hasNext();
    }

    Node* getNext() {return next;}

    void setNext(Node<T>* pNode) {next = pNode;}

    T getData() {return data;}

    Node<T>& appendToTail(Node<T>* tail){
        Node<T>* pnode = this;

        while ((pnode->getNext()) != NULL)
            pnode = pnode->getNext();

        pnode->setNext(tail);

        return *this;
    }

    Node& insert(Node<T>* pnode) {
        Node<T>* pend = pnode;

        while (pend->next != NULL)
            pend = pend->next;

        pend->next = this->next;
        this->next = pnode;

        return *this;
    }

    void print() {
        Node<T> *p = this;

        while (p->hasNext()){
            cout<<p->data<<" -> ";
            p = p->next;
        }

        cout<<p->data<<endl;
    }
};


template <class T>
class Queue {
private:
    Node<T>* first, *last;

public:
    Queue() : first(NULL), last(NULL) {}

    void enqueue(Node<T>* node){
        if (first == NULL){
            first = node;
            last = node;
            node->setNext(NULL);
        } else {
            last->setNext(node);
            last = node;
        }

    }

    Node<T>* dequeue(){
        if (first!=NULL){
            Node<T>* out = first;
            first = first->getNext();
            return out;
        }

        return NULL;
    }

};


#endif //QUEUE_QUEUE_H
