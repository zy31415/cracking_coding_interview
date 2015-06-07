//
// Created by zy on 6/6/15.
//

#include<iostream>
using namespace std;

#include <string.h>
#include "gtest/gtest.h"
#include "functions.h"

TEST(CalculateLength, Simplest) {

// the simplest case:
ASSERT_EQ(6, calculate_length("abcdef"));

// heading spaces
ASSERT_EQ(6, calculate_length("    abcdef"));

// middle space
ASSERT_EQ(9, calculate_length("abc def"));

// middle spaces
ASSERT_EQ(9, calculate_length("abc  def"));

// middle spaces
ASSERT_EQ(15, calculate_length("abc  def    fgh"));
}

TEST(CalculateLength, Tailing) {
//tailing spaces
ASSERT_EQ(15, calculate_length("abc  def    fgh     "));

}

TEST(Replace, CopyArr) {
//tailing spaces
char arr1[] = "abcdef";
char arr2[50];

copy_arr(arr1, arr2);

ASSERT_EQ(0, strcmp(arr1, arr2));
}

TEST(Replace, Test1) {
//tailing spaces
char arr[] = "abcdef";

    replace_spaces(arr);

ASSERT_EQ(0, strcmp(arr, "abcdef")) << "Output:" << arr <<endl;

}

TEST(Replace, Test2) {
//tailing spaces
char arr[50] = "abc def";
    replace_spaces(arr);
EXPECT_EQ(0, strcmp(arr, "abc%20def")) << "Output:" << arr <<endl;
}

TEST(Replace, ConsecutiveSpaces) {
//tailing spaces
char arr[50] = "abc   def";
    replace_spaces(arr);
EXPECT_EQ(0, strcmp(arr, "abc%20def")) << "Output:" << arr <<endl;
}

TEST(Replace, HeadningSpaces) {
//tailing spaces
char arr[50] = "  abc   def";
    replace_spaces(arr);
EXPECT_EQ(0, strcmp(arr, "abc%20def")) << "Output:" << arr <<endl;
}

TEST(Replace, MultipleSpaces) {
//tailing spaces
char arr[100] = "  abc   def  asdfasdf asdf a asdf asd asdf   ";
    replace_spaces(arr);
EXPECT_EQ(0, strcmp(arr, "abc%20def%20asdfasdf%20asdf%20a%20asdf%20asd%20asdf")) << "Output:" << arr <<endl;
}

TEST(FindLengthAndReplace, MultipleSpaces) {
//tailing spaces
char arr[100] = "  abc   def  asdfasdf asdf a asdf asd asdf   ";

    replace_spaces(arr, calculate_length(arr));
EXPECT_EQ(0, strcmp(arr, "abc%20def%20asdfasdf%20asdf%20a%20asdf%20asd%20asdf")) << "Output:" << arr <<endl;
}

TEST(FindLengthAndReplace, BufferSize) {
// If the buffer size is smaller than needed, function replace_spaces will return -1.
char arr[100] = "  abc   def  asdfasdf asdf a asdf asd asdf   ";

EXPECT_EQ(-1, replace_spaces(arr, 10));
}