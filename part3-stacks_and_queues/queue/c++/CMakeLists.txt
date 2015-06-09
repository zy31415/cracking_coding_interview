cmake_minimum_required(VERSION 3.2)
project(queue)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES gtest_main.cpp tests.cpp Queue.cpp)

# for gtest
include_directories("/home/zy/programs/gtest/include/")
link_directories("/home/zy/programs/gtest/lib/.libs")

add_executable(queue ${SOURCE_FILES} Queue.cpp Queue.h)

target_link_libraries(queue gtest pthread)