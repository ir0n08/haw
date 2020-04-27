/*
	UGLY NUMBERS
	Eisenmann Paul
	HAW Landshut 
	IF Semester I
	Praktikum II
	15. Nov 2019 

	paul.eisenmann@prosiebensat1.com
	https://github.com/ir0n08/haw

	Playing games with numbers...

*/


#include <stdio.h>

unsigned int is_ugly(unsigned int n) {
	
	int t = 1;

	while(t) {
		if(n%2==0)
			n=n/2;
		else if(n%3==0)
			n=n/3;
		else if(n%5==0)
			n=n/5;
		else if(n==1)
			return 1;
		else
			t=0;
	}

	return 0;
}




int main(void) {

	unsigned int c = 0, i = 0;

	while(i<1000){
		c++;
		if(is_ugly(c))
			i++;
	}
	printf("1000st hässliche ist: %d\n", c );

	return 0;
}

