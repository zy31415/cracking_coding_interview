#include <gtest/gtest.h>
#include "image_rotation.h"
#include <stdexcept>
using namespace std;

TEST(Image, Initilization){
Image image1(20);
generate_image(image1);

ASSERT_THROW(
{Image image2(0);},
invalid_argument
);
}

TEST(Image, Initilization2){
ASSERT_THROW(
{Image image2(-1);},
invalid_argument
);
}


TEST(Image, CopyConstructor){
Image image1(2);
generate_image(image1);

Image image2 = image1;

print_image(image1);
print_image(image2);

}

TEST(Image, EqualityOperator){
Image image1(20);
generate_image(image1);
Image image2 = image1;

ASSERT_TRUE(image1 == image2);

image2.head[3] = 100;
ASSERT_FALSE(image1 == image2);

}

TEST(Image, GetValueOperator){
int N = 20;
Image image(N);
generate_image(image);

int value = 0;
for (int jj=0; jj<N; jj++)
    for (int ii=0; ii<N; ii++)
        ASSERT_EQ(value++, image(ii,jj));
}

TEST(Image, Rotation){
Image image(3);
generate_image(image);
print_image(image);
rotate_image(image);
print_image(image);
}


TEST(Image, Rotation2){
Image image(20);
generate_image(image);

Image image0 = image;

// rotate four times should get the same image.
for (int i=0; i<4; i++)
    rotate_image(image);

ASSERT_TRUE(image0 == image);

}


TEST(Image, RotationSizeOne){
Image image(1);
generate_image(image);

Image image0 = image;

// rotate four times should get the same image.
for (int i=0; i<4; i++)
rotate_image(image);

ASSERT_TRUE(image0 == image);

}

TEST(Image, RotationRecursive1){
Image image(3);
generate_image(image);
print_image(image);
rotate_image_recursive(image);
print_image(image);
}

TEST(Image, RotationRecursive2){
Image image(20);
generate_image(image);

Image image0 = image;

// rotate four times should get the same image.
for (int i=0; i<4; i++)
    rotate_image_recursive(image);

ASSERT_TRUE(image0 == image);

}