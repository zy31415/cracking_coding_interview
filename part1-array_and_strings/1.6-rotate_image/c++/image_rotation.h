//
// Created by zy on 6/7/15.
//

#ifndef IMAGE_ROTATION_H
#define IMAGE_ROTATION_H

#include<stdint.h>

#define pixel uint32_t
#define image_size unsigned

struct Image {
    pixel* head;
    const image_size N;

    Image(const int N); // Initialize an Image object with size N*N.
    Image(const Image& image); // Copy constructor.

    ~Image();

    bool operator == (const Image& rhs);

    pixel& pget(int x, int y); //get the value at (x,y)
    pixel& operator () (int x, int y) {return pget(x,y);}
};

void generate_image(Image& image);

void print_image(const Image& image);

void rotate_image(Image& image); // Non-recursive method.

void rotate_image_recursive(Image& image, int jj=0); // Recursive method.

#endif //IMAGE_ROTATION_H
