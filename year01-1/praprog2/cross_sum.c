/*
	SIZE OF TYPES
	Eisenmann Paul
	HAW Landshut 
	IF Semester I
	Praktikum II
	15. Nov 2019 

	paul.eisenmann@prosiebensat1.com
	https://github.com/ir0n08/haw

	Calculate the cross sum of a given number

*/


#include <stdio.h>

int main(void) {
	
	int input;
	int sum = 0;

	printf("Gib dein Zeugs ein!\n");
	scanf("%d", &input);

	while(input) {
    	sum += (input % 10);
    	input /= 10;
	}
	printf("Quersumme ist: %d\n", sum);

	return 0;
}