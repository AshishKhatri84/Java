import java.util.*;
class RalphAndTypingTest{
	static String fun(String str1, String str2, int n){
		String temp = "";
		int t = 0;
		for(int i = 0; i < str2.length(); i++){
			switch (str2.charAt(i)) {
				case 'w' -> {
					t = 1;
					temp = str1;
				}
				case 'd' -> {
					t = 0;
					temp = str1;
					int len = str1.length();
					str1 = str1.substring(0, len-n);
				}
				case 'u' -> {
					t = 0;
					str1 = temp;
				}
				default -> {
					if (t == 1) {
						str1 = str1 + str2.charAt(i);
					}
				}
			}
		}
		return str1;
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			String str1 = sc.next();
			String str2 = sc.next();
			int n = sc.nextInt();
			System.out.println(fun(str1, str2, n));
		}
	}
}
