//
// Created by zy on 6/8/15.
//

#include "header.h"

bool Node::hasNextNext() {
    return hasNext() && next->hasNext();
}

Node& Node::appendToTail(Node* tail) {

    Node* pnode = this;

    while ((pnode->getNext()) != NULL)
        pnode = pnode->getNext();

    pnode->setNext(tail);

    return *this;
}

void Node::print() {

    Node *p = this;

    while (p->hasNext()){
        cout<<p->getData()<<" -> ";
        p = p->getNext();
    }

    cout<<p->getData()<<endl;

}

Node& Node::insert(Node* pnode){
    Node* pend = pnode;

    while (pend->next != NULL)
        pend = pend->next;

    pend->next = this->next;
    this->next = pnode;

    return *this;
}

Node* create_a_linked_list(int len) {
    Node* pnode = new Node(0);

    Node* ptail = pnode;
    for (int ii=1; ii<len; ii++){
        Node* next = new Node(ii);
        ptail -> appendToTail(next);
        ptail = next;
    }

    return pnode;
}

void wave(Node* pnode) {
    Node *p1 = pnode, *p2 = NULL;

    if (p1->hasNext())
        p2 = p1->getNext();
    else
        return ;

    // find the middle:
    while (p2->hasNextNext()) {
        p1 = p1->getNext();
        p2 = p2->getNext()->getNext();
    }

    Node *insert, *next;
    // start to wave
    p2 = pnode;

    while (p1 != p2 ) {
        insert = p1->getNext();

        p1->setNext(insert->getNext());

        insert->setNext(NULL);

        next = p2->getNext();
        p2->insert(insert);
        p2 = next;
    }
}
