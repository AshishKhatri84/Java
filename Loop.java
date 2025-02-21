public class Loop { 
public static void main(String[] args) { 
//For Loop
int sum = 0; 
for(int j = 1; j<=10; j++) { 
sum = sum + j; 
} 
System.out.println("The sum of first 10 natural numbers is " + sum); 
//ForLoop Example
for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
System.out.print("* ");  
}  
System.out.println();//new line  
}
//For-Each Loop
int ar[] = { 10, 50, 60, 80, 90 };
for (int element : ar )
System.out.print(element + " ");

//While Loop
int i=1;
while(i<=10){
System.out.println(i);
i++;
}

//do-while Loop
int j = 0;
do {
System.out.println("Print statement");
j++;
}
while (j < 0);
}} 