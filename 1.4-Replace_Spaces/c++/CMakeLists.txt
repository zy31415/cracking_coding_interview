cmake_minimum_required(VERSION 3.2)
project(replace_spaces)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp functions.cpp tests.cpp)

include_directories("/home/zy/programs/gtest/include/")

# set the path to the library folder
link_directories("/home/zy/programs/gtest/lib/.libs")

add_executable(replace_spaces ${SOURCE_FILES})

target_link_libraries(replace_spaces gtest pthread)