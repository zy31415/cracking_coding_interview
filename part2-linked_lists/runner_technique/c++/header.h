//
// Created by zy on 6/8/15.
//

#ifndef RUNNER_TECHNIQUE_NODE_H
#define RUNNER_TECHNIQUE_NODE_H

# include<iostream>

using namespace std;

class Node {
private:
    Node* next = NULL;
    int data;

public:
    Node(int data) : data(data), next(NULL){};
    ~Node(){}

    bool hasNext() {return next!=NULL;}
    bool hasNextNext();

    Node* getNext() {return next;}
    void setNext(Node* pNode) {next = pNode;}

    int getData() {return data;}

    Node& appendToTail(Node* tail);

    Node& insert(Node* pnode);

    void print();
};

Node* create_a_linked_list(int len);

void wave(Node* pnode);

#endif //RUNNER_TECHNIQUE_NODE_H
