package set;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set set = new HashSet();// HashSet 자동정열의 특징을 가지고있다
		
		int count=0;
		//1~10까지 랜덤숫자를 set에 담는다 
		//몇번을 실행했는지 출력했으면 좋겠다
		
		for (int i = 0; 10 > set.size(); i++) {
			int num =(int)(Math.floor(Math.random()*10))+1;
			set.add(num);
			count++;
		}
		
		
		
		System.out.println("반복문 실행 횟수:"+count);
		System.out.println(set);

	}

}
