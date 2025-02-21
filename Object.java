class Student{
int rollno;
String name;
void insert(int r, String n){
rollno=r;
name=n;
}
void display(){ System.out.println(rollno+" "+name); }
}
class Object{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insert(111,"Karan");
s2.insert(222,"Aryan");
s1.display();
s2.display();
}
} 