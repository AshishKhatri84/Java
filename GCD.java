class GCD{
public static int findGcd(int a, int b) {
    while(a > 0 && b > 0) {
        if(a > b) {
            a = a % b;
        }
        else {
            b = b % a;
        }
    }
    if(a == 0) {
        return b;
    }
    return a;
}

public static void main(String[] args) {
    // int[] num = {3, 4, 5};
    // int[] rem = {2, 3, 1};

    System.out.println(findGcd(36, 27));
}   
}