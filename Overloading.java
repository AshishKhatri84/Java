class ctp{
    void run(int a)
    {
    System.out.println(a*a);
    System.out.println(a*a*a);
    }
    void run(int a, int b)
    {
        System.out.println(a*b);
    }}
    public class Overloading
    {
    public static void main(String[] args){
        ctp o1= new ctp();
        o1.run(5);
        o1.run(3,5);
    }}