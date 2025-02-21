class EC{
private int age;
private String name;
void setname(int a, String s){
age=a;
name=s;
}
void get(){
System.out.println(age+ " "+name);
}}
public class Encapsulation {
public static void main(String[] args) {
EC b1=new EC();
b1.setname(101, "ravi");
b1.get();
}}