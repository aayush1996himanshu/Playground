#include<stdio.h>
int main()
{
  int a;
  scanf("%d" ,&a);
  int b=a%10;
  int c=a/100;
  int d=b+c;
  printf("%d",d);
  return 0;
}