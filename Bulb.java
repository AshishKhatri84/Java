public class Bulb{
    public int countBulb(int n){
        return (int)(Math.sqrt(n));
}
    public static void main(String[] args) {
        int n=8;
        Bulb obj = new Bulb();
        System.out.println(obj.countBulb(n));
}}