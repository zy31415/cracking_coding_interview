#include "gtest/gtest.h"
#include "header.h"

TEST(Node, Initialization){
    Node node(10);
}


TEST(Node, AppendToTail){
    Node node1(10);
    Node node2(11);

    node1.appendToTail(&node2);

    node1.print();

}

TEST(Node, Insert1){
    Node node1(10);
    Node node2(11);

    node1.insert(&node2);

    node1.print();

}

TEST(Node, Insert2){
    Node node1(1);
    Node node2(2);
    Node node3(3);
    Node node4(4);
    Node node5(5);

    node1.insert(&node5).insert(&node4);
    node2.insert(&node3);

    node1.insert(&node2);

    node1.print();

}

TEST(Node, CreateLinkedList){
    Node* p;

    p = create_a_linked_list(10);

    p -> print();

}

TEST(Node, Wave){
    Node* p;

    p = create_a_linked_list(10);
    p -> print();

    wave(p);

    p->print();

}

TEST(Node, WaveOddNumber){
    Node* p;

    p = create_a_linked_list(11);
    p -> print();

    wave(p);

    p->print();

}