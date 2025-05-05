public class Conversion {
    public static void main(String[] args) {

//  1. Using Implicit Casting
char ch = '7';
int num = ch - '0';  // Converts '5' to 5
System.out.println("Converted integer: " + num);

//  2. Using Character.getNumericValue()
char cha = '9';
int numb = Character.getNumericValue(cha);
System.out.println("Converted integer: " + numb);

//  3. Using Integer.parseInt() with Strings
char c = '5';
int nu = Integer.parseInt(String.valueOf(c));
System.out.println("Converted integer: " + nu);

//  4. Direct Conversion for ASCII Value
char chr = 'A';
int asciiValue = (int) chr;
System.out.println("ASCII value: " + asciiValue);
}}