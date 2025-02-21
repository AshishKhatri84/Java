public class IfExample { 
public static void main(String[] args) { 
int x = 10; 
int y = 12; 

//Simple if
if(x+y > 20) { 
System.out.println("x + y is greater than 20"); 
}

//if-else
if(x+y < 10) { 
System.out.println("x + y is less than 10"); 
} else { 
System.out.println("x + y is greater than 20");
}

//if-else-if ladder
String city = "Delhi"; 
if (city == "chennai") { 
System.out.println("city is chennai"); 
}
else if (city == "Noida") { 
System.out.println("city is noida"); 
}
else if(city == "Agra") { 
System.out.println("city is agra"); 
}
else { 
System.out.println(city); 
}
//Nested if
if(x==10){
if(y==12){
System.out.println("True");
}}
}} 