#include <iostream>

using namespace std;

#include "gtest/gtest.h"
#include "Queue.h"

int main(int argc, char** argv) {
    cout<< "Google test: Running tests:\n";
    testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}