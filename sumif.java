class cp
{
    void sum(int a, int b)
    {
        //int c= a+b;
        System.out.println(a+b);
    }
    void sum(Float a, int b)
    {
        System.out.println(a+b);
    }
    void sum(float a, float b)
    {
        System.out.println(a+b);
    }
    void sum(float a, float b, int c)
    {
        System.out.println(a+b+c);
    }
    void sum(float a, float b, float c)
    {
        System.out.println(a+b+c);
    }
    void sum(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}
public class sumif{
    public static void main(String[] args){
        cp o1= new cp();
        o1.sum(5,7);
        o1.sum(5,7);
        o1.sum(5,7);
        o1.sum(5,7,8);
        o1.sum(5,7,8);
        o1.sum(5,7,8);
    }
}