#include<stdio.h>

int power(int,int);
int main()
{
  	int Number, FirstDigit, DigitsCount, LastDigit, a, b, SwapNum;
 
  	printf("\n Enter a number : ");
  	scanf("%d", & Number);
  	
  	DigitsCount = log10(Number); 	
  	FirstDigit = Number / power(10, DigitsCount);
  	
  	LastDigit = Number % 10;
  	
  	a = FirstDigit * (power(10, DigitsCount));
  	b = Number % a;
  	Number = b / 10;
  	
  	SwapNum = LastDigit * (power(10, DigitsCount)) + (Number * 10 + FirstDigit);
	    
	printf(" \n The Number after Swapping First Digit and Last Digit =  %d", SwapNum);
 
  	return 0;
}
int power(int a,int b)
{
    int p=1,i;
    for(i=1;i<=b;i++)
    {
        p=p*a;
    }
    return p;
}
