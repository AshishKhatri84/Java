class Number {
    // Recursive method to convert int to binary (as a String)
    public String intToBin(int num) {
        if (num == 0) return "0";  // Base case
        return intToBin(num / 2) + (num % 2); // Recursive call
    }

    // Convert binary string to decimal
    public static int Deci(String b) {
        return Integer.parseInt(b, 2);
    }

    // Convert decimal to binary
    public static String Bin(int d) {
        return Integer.toBinaryString(d);
    }
    
    public static void main(String[] args) {
        int n = 123;
        String b = "1101";
        int d = 13;

        Number num = new Number();
        System.out.println("Recursive Decimal to Binary: " + n + " → " + num.intToBin(n));
        System.out.println("Binary to Decimal: " + b + " → " + Deci(b));
        System.out.println("Decimal to Binary: " + d + " → " + Bin(d));
    }
}