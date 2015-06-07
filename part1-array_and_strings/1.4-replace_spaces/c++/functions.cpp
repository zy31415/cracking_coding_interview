/* Replace spaces
Problem description:
Write a method to replace all spaces in a string with'%20'. You may assume that
the string has sufficient space at the end of the string to hold the additional
characters, and that you are given the "true" length of the string. 
(Note: if implementing in Java, please use a character array so that you can 
perform this operation in place.)
EXAMPLE
Input:  "Mr John Smith    "
Output: "Mr%20Dohn%20Smith"

My response:
I made two assumptions here:
1. Ignore heading and trailing spaces;
2. Consecutive spaces are treated as a single one.

*/

#include<iostream>
using namespace std;

#include "functions.h"

int calculate_after_replacement_length(const char *arr) {
    const char *p = arr;

    // skip heading spaces
    while (*p == ' ')
        p++;

    int length = 0;
    while (*p != '\0') {
        if (*p == ' ') {
            // multiple spaces are counted as one space.
            while (*p == ' ')
                p++;
            // ignore tailing spaces
            if (*p == '\0')
                break;
            length += 3;
        } else {
            p++;
            length++;
        }
    }
    return length;
}

void copy_arr(const char* from, char* to){
    const char* p_from = from;
    char*p_to = to;

    while (*p_from != '\0')
        *p_to++ = *p_from++;

    *p_to = *p_from;
}

int replace_spaces(char *arr, int buffer_size){
    char buffer[buffer_size];

    char* p_buffer = buffer;
    char* p = arr;

    // skip heading spaces
    while (*p == ' ')
        p++;

    int length = 0;
    while (*p != '\0') {
        if (*p == ' ') {
            // multiple spaces are counted as one space.
            while (*p == ' ')
                p++;
            // ignore tailing spaces
            if (*p == '\0')
                break;

            *p_buffer++ = '%';
            *p_buffer++ = '2';
            *p_buffer++ = '0';

            length += 3;

        } else {
            *p_buffer++ = *p++;
            length++;
        }
    }

    // if the needed length is smaller than the buffer_size than the function return -1.
    if (length > buffer_size)
        return -1;

    *p_buffer = *p;

    copy_arr(buffer, arr);

    return 0;
}
