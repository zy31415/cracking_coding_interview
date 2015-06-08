cmake_minimum_required(VERSION 3.2)
project(rotate_image)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES gtest_main.cpp image_rotation.cpp tests.cpp)

# for gtest:
include_directories("/home/zy/programs/gtest/include/")
link_directories(/home/zy/programs/gtest/lib/.libs/)

add_executable(rotate_image ${SOURCE_FILES})

target_link_libraries(rotate_image gtest pthread)