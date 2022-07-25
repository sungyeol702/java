package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		// Q3. 아래와 같은 출력문을 만들어보세요
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// ABCDEFGHIJKLMNOPQRSTUVWXY
		// ABCDEFGHIJKLMNOPQRSTUVWX
		// ABCDEFGHIJKLMNOPQRSTUVW
		// ABCDEFGHIJKLMNOPQRSTUV
		// ...........
		// ........
		// AB
		// A
//		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		
//		for (int i = 0; i <= str.length(); i++) {
//			for (int j = 0; j < str.length(); j++) {
//				System.out.print(str.charAt(j));
//			}
//			System.out.println();
//			i=0;
//			str = str.substring(0,str.length()-1);
//		}
//		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0;i<str.length();i++) {
			System.out.println(str.substring(0, str.length()-i));
		};
	
		
		for(char i = 'Z'; i >= 'A'; i--) {
			for(char j = 'A'; j <= i; j++) {
				System.out.print(j);
				}
			System.out.println();
	}
		for (int j = 0; j < 26; j++) {
			for (int i = 65; i < (91 - j); i++) {
				System.out.print((char)i);
			}
			System.out.println();
		}

		System.out.println((char)66);
	}
	

}
