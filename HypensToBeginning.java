public class HypensToBeginning {
    public static String move(String str) {
        StringBuilder h = new StringBuilder();
        StringBuilder nh = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                h.append(ch);
            } else {
                nh.append(ch);
            }
        }
        return h.toString() + nh.toString();
    }
    public static void main(String[] args) {
        String str = "a-b-c-d-e-f-g";
        String result = move(str);
        System.out.println(result);
    }
}