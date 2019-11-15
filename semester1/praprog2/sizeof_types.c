
/*
	SIZE OF TYPES
	Eisenmann Paul
	HAW Landshut 
	IF Semester I
	Praktikum II
	15. Nov 2019 

	paul.eisenmann@prosiebensat1.com
	https://github.com/ir0n08/haw

	Print Out size of data types

*/


#include <stdio.h>

int main(void) {
	
	printf("Starting size of types...\n\n");

	printf("Size of short %zd bytes\n", sizeof(short));
	printf("Size of s short %zd bytes\n", sizeof(signed short));
	printf("Size of uns short %zd bytes\n", sizeof(unsigned short));
	printf("Size of int %zd bytes\n", sizeof(int));
	printf("Size of s int %zd bytes\n", sizeof(signed int));
	printf("Size of uns int %zd bytes\n", sizeof(unsigned int));
	printf("Size of long %zd bytes\n", sizeof(long));
	printf("Size of s long %zd bytes\n", sizeof(signed long));
	printf("Size of uns long %zd bytes\n\n", sizeof(unsigned long));

	printf("Size of float %zd bytes\n", sizeof(float));
	printf("Size of double %zd bytes\n", sizeof(double));	
	printf("Size of long double %zd bytes\n\n", sizeof(long double));

	printf("Size of char %zd bytes\n", sizeof(char));
	printf("Size of s char %zd bytes\n", sizeof(signed char));
	printf("Size of uns char %zd bytes\n\n", sizeof(unsigned char));
	
	// -> un/signed has no effect on sizeof

	return 0;
}