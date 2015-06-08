#include <iostream>

using namespace std;

#include "gtest/gtest.h"
#include "header.h"

int main(int argc, char** argv) {

    create_a_linked_list(10);

    cout<< "Google test: Running tests:\n";
    testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}

