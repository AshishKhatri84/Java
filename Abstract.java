abstract class gf
{
    abstract void add();
    abstract void sub();
    abstract void mul();
}
class cd extends gf
{
    int a=5,b=6;
    @Override
    void add()
    {
        System.out.println(a+b);
    }
    @Override
    void sub()
    {
        System.out.println(a-b);
    }
    @Override
    void mul()
    {
        System.out.println(a*b);
    }
}
public class Abstract{
    public static void main(String[] args){
        cd o1=new cd();
        o1.add();
        o1.sub();
        o1.mul();
    }
}