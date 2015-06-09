#include <string>
#include "gtest/gtest.h"
#include "Queue.h"

using namespace std;

TEST(Node, Initialization){
Node<int> node(10);
}

TEST(Node, AppendToTail){
    Node<int> node1(10);
    Node<int> node2(11);

    node1.appendToTail(&node2);

    node1.print();
}

TEST(Node, AppendToTail2){
    Node<string> node1("abcd");
    Node<string> node2("efg");

    node1.appendToTail(&node2);

    node1.print();
}

TEST(Queue, Initialization){
    Queue<int> queue1;
    Queue<string> queue2;
}

TEST(Queue, enqueue){
Queue<int> queue;

for (int ii=0; ii<10; ii++){
    Node<int> node(10);
    queue.enqueue(&node);
}

}

TEST(Queue, dequeue){
    Queue<int> queue;

    for (int ii=0; ii<12; ii++){
        Node<int>* pnode = new Node<int>(ii);
        queue.enqueue(pnode);
    }


    for (int ii=0; ii<16; ii++){
        Node<int>* pnode;
        pnode = queue.dequeue();
        cout<<pnode->getData()<<endl;
    }

}