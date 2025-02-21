public class StringExample{
    public static void main(String args[]) {
    
    // Character to String
    char ch[]={'s','t','r','i','n','g'};
    String s1=new String(ch);
    System.out.println(s1);

    // Numeric String
    String s2=new String("Raj43");
    System.out.println(s2);
    // Capital Order
    String s2a=s2.toUpperCase();
    System.out.println(s2a);
    // Reverse Order
    StringBuilder s2b = new StringBuilder(s2a).reverse();
    System.out.println(s2b);
    // Vertical Order
    for (int i = 0; i < s2a.length(); i++){
    System.out.println(s2a.charAt(i));}
    for (int i = 0; i < s2b.length(); i++){
    System.out.println(s2b.charAt(i));}

    // Simple String
    String s3= "Welcome To Java Class";
    System.out.println(s3);
    // Small Order
    String s3a=s3.toLowerCase();
    System.out.println(s3a);
    // Capital Order
    String s3b=s3.toUpperCase();
    System.out.println(s3b);
    // Reverse Order
    StringBuilder s3c = new StringBuilder(s3b).reverse();
    System.out.println(s3c);
    // Vertical Order
    for (int i = 0; i < s3.length(); i++){
    System.out.println(s3.charAt(i));
}}}