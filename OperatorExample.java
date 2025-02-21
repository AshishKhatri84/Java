public class OperatorExample{ 
public static void main(String args[]){ 
int a=10; 
int b=5;
int c=20;
//Unary ++ --
System.out.println(a++);//10 (11) 
System.out.println(++a);//12 
System.out.println(a--);//12 (11) 
System.out.println(--a);//10 

//Arithmetic +*
System.out.println(a+b);//15 
System.out.println(a-b);//5 
System.out.println(a*b);//50 
System.out.println(a/b);//2 
System.out.println(a%b);//0 

//Shift << >>
System.out.println(10<<2);//10*2^2=10*4=40 
System.out.println(10<<3);//10*2^3=10*8=80 
System.out.println(20<<2);//20*2^2=20*4=80 
System.out.println(15<<4);//15*2^4=15*16=240
System.out.println(10>>2);//10/2^2=10/4=2 
System.out.println(20>>2);//20/2^2=20/4=5 
System.out.println(20>>3);//20/2^3=20/8=2

//Relational 
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a==b);

//Logical && || and Bitwise & |
System.out.println(a<b&&a<c);//false && true = false
System.out.println(a<b&a<c);//false & true = false 
System.out.println(a>b||a<c);//true || true = true 
System.out.println(a>b|a<c);//true | true = true

//Ternary ?
int min=(a<b)?a:b; 
System.out.println(min); 

//Assignment +=
System.out.println(a+=4); 
System.out.println(b-=4);

}}