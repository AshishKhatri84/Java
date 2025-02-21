interface rb
{
    void sum();
    void sub();
    void mul();
}
class b1 implements rb
{
    int a=5,b=6;
    @Override
    public void sum()
    {
        System.out.println(a+b);
    }
    @Override
    public void sub()
    {
        System.out.println(a-b);
    }
    @Override
    public void mul()
    {
        System.out.println(a*b);
    }
}
public class Interface{
    public static void main(String[] args){
        b1 o1=new b1();
        o1.sum();
        o1.sub();
        o1.mul();
    }
}