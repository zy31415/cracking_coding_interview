#include <iostream>
#include "gtest/gtest.h"

using namespace std;

int main(int argc, char** argv) {
    cout<< "Google test: Running tests:\n";
    testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}