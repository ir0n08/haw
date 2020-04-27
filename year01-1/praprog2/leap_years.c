/*
	LEAP YEAR
	Eisenmann Paul
	HAW Landshut 
	IF Semester I
	Praktikum II
	15. Nov 2019 

	paul.eisenmann@prosiebensat1.com
	https://github.com/ir0n08/haw

	"Switch year calculator ;)"

*/


#include <stdio.h>
#include<time.h>

int is_leapyear1(int n) {

	int a = n%4, b = n%100, c = n%400;

	if(a && !(b && !c))
		return 1;
	else
		return 0;
}

int is_leapyear2(int n) {
	
	int a = n%4, b = n%100, c = n%400;

	if((c || !b) && a)
		return 1;
	else
		return 0;
}




int main(void) {

	time_t starttime, endtime;
	int c = 0;

	time(&starttime);
	for(int i = 1; i <= 1000000000; i++) {
		if(is_leapyear1(i)) 
			c++;
	}
	time(&endtime);
	printf("Time Diff for is_leapyear1: %f\n", difftime(endtime,starttime));
	printf("Leap Year Count: : %d\n", c);


	printf("\n\n---------------\n\n");
	c = 0;
	time(&starttime);
	for(int j = 1; j <= 1000000000; j++) {
		if(is_leapyear2(j)) 
			c++;
	}
	time(&endtime);
	printf("Time Diff for is_leapyear2: %f\n", difftime(endtime,starttime));
	printf("Leap Year Count: : %d\n", c);

	return 0;
}


/*

Output with -O0:

	root@xUbuntuVM:/git/haw/semester1/praprog2# gcc -o leap_years leap_years.c -O0
	root@xUbuntuVM:/git/haw/semester1/praprog2# ./leap_years 
	Time Diff for is_leapyear1: 10.000000
	Leap Year Count: : 750000000


	---------------

	Time Diff for is_leapyear2: 9.000000
	Leap Year Count: : 750000000




Output with -O2:

	root@xUbuntuVM:/git/haw/semester1/praprog2# gcc -o leap_years leap_years.c -O2
	root@xUbuntuVM:/git/haw/semester1/praprog2# 
	root@xUbuntuVM:/git/haw/semester1/praprog2# ./leap_years 
	Time Diff for is_leapyear1: 2.000000
	Leap Year Count: : 750000000


	---------------

	Time Diff for is_leapyear2: 2.000000
	Leap Year Count: : 750000000





*/
