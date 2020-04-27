
/*
	MONEY EXCHANGE CALC	
	Eisenmann Paul
	HAW Landshut 
	IF Semester I
	Praktikum I
	25. Oct 2019 

	paul.eisenmann@prosiebensat1.com
	https://github.com/ir0n08/haw

	Calculate the value of a currency with a input currency and the exchange rate

*/


#include <stdio.h>

const double exrate_eur_usd = 1.11; // https://www.xe.com/currencyconverter/convert/?Amount=1&From=EUR&To=USD


/* 	This function wants 2 values: the input amout of the first currency (eg. 10EUR)
	and the exchange rate to the output currency (eg. 1.26 for USD)
	Output is the multipication of these two values as double (this is the output currency)
*/

double rate_exchange(double input_value, double exchange_rate) {
	return input_value*exchange_rate;
}

int main(void) {
	
	double table_val[7] = {1.0,2.0,5.0,10.0,20.0,50.0,100.0};
	
	printf("\n\nExchange Calucator for USD/EUR and back\n");
	for(int i=0;i<7;i++) {
		printf("%.2f € are %.2f USD\n", table_val[i], rate_exchange(table_val[i],exrate_eur_usd));
	}
	printf("The exchange rate is: %.2f\n\n",exrate_eur_usd); // line break

	for(int i=0;i<7;i++) {
		printf("%.2f USD are %.2f €\n", table_val[i], rate_exchange(table_val[i],1.0/exrate_eur_usd));
	}
	printf("The exchange rate is: %.2f\n\n...the end\n",1.0/exrate_eur_usd); // line break

	return 0;
}