cmake_minimum_required(VERSION 3.2)
project(runner_technique)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES gtest_main.cpp node.cpp tests.cpp)

# for gtest
include_directories("/home/zy/programs/gtest/include/")
link_directories("/home/zy/programs/gtest/lib/.libs")

add_executable(runner_technique ${SOURCE_FILES})

target_link_libraries(runner_technique gtest pthread)