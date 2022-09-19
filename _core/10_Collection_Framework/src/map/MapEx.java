package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("Lee", "234");
		map.put("kim", "123");
		map.put("choi", "124");
		map.put("park", "134");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 pw를 입력");
			System.out.println("아이디 입력");
			String id = sc.next();
			System.out.println("비번입력");
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인성공");
				}else {
					System.out.println("비번다름");
				}
			}else {
				System.out.println("아이디 없음");
			}
		}

	}

}
