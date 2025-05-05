import java.util.*;
public class discount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the price, discount and shipping charges of Flipkart, Snapdeal and Amazon: ");
        int fp = sc.nextInt();
        int fd = sc.nextInt();
        int fs = sc.nextInt();
        int sp = sc.nextInt();
        int sd = sc.nextInt();
        int ss = sc.nextInt();
        int ap = sc.nextInt();
        int ad = sc.nextInt();
        int as = sc.nextInt();
        sc.close();

        int tf = (fp-(fd/100)*fp)+fs;
        int sf = (sp-(sd/100)*sp)+ss;
        int af = (ap-(ad/100)*ap)+as;

        System.out.println("Total cost of Flipkart: "+tf);
        System.out.println("Total cost of Snapdeal: "+sf);
        System.out.println("Total cost of Amazon: "+af);

        if(tf<sf && tf<af){
            System.out.println("Choose Flipkart");
        }
        else if(sf<tf && sf<af){
            System.out.println("Choose Snapdeal");
        }
        else{
            System.out.println("Choose Amazon");
        }
        }
    }   
}