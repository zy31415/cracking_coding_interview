#ifndef FUNCTIONS_H
#define FUNCTIONS_H

#define DEFAULT_BUFFER_SIZE 100  // default buffer size for replace_spaces funtion.

int calculate_length(const char* arr);

int replace_spaces(char *arr, int buffer_size = DEFAULT_BUFFER_SIZE);

void copy_arr(const char* from, char* to);


#endif