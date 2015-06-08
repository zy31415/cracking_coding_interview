//
// Created by zy on 6/7/15.
//

#include "image_rotation.h"
#include<iostream>
#include <stdexcept>

using namespace std;

Image::Image(const int N) : N(N){
    head = new pixel[N*N];
}

Image::Image(const Image& image) : Image(image.N){
    head = new pixel[N*N];

    pixel* p1 = this -> head, *p2 = image.head;
    for (int ii = 0; ii < N*N; ii++){
        *p1++ = *p2++;
    }


}

Image::~Image(){
    delete [] head;
}

bool Image::operator==(const Image &rhs) {
    if (this -> N == rhs.N){
        pixel* p1 = this -> head, *p2 = rhs.head;
        for (int ii = 0; ii < N*N; ii++)
            if (*p1++ != *p2++)
                return false;
    } else
        return false;
    return true;
}

pixel& Image::pget(int x, int y){
    if (x<0 || x>N || y<0 || y>N)
        throw invalid_argument("index out of range.");
    return head[y*N+x];
}

void generate_image(Image& image){
    int N = image.N;
    pixel* head = image.head;

    int value = 0;
    for (pixel* p = head; p < head + N * N; p++){
        *p = value++;
    }
}

void print_image(const Image& image) {
    int N = image.N;

    pixel *p = image.head;
    for (int ii = 0; ii < N; ii++) {
        for (int jj = 0; jj < N; jj++)
            cout << *p++ << ' ';
        cout << '\n';
    }
}

void rotate_image(Image& image) {
    /*
     * (x,y) ==> (N-1-y, x)
     */
    int N = image.N;
    pixel *head = image.head;

    for (int jj = 0; jj < (N-1.)/2.; jj++)
        for (int ii = jj; ii < N-1.-jj; ii++) {
            pixel tp = image(ii,jj);
            image(ii,jj) = image(jj, N-1-ii);
            image(jj ,N - 1 - ii) = image(N - 1 - ii, (N - 1 - jj));
            image(N - 1 - ii ,N - 1 - jj) = image(N - 1 - jj ,ii);
            image(N - 1 - jj, ii) = tp;
        }
}
