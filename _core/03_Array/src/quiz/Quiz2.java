package quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		//테스트에 참여할 인원수를 입력하세요>3
		//1번째 사람의 이름을 입력하세요
		//1번째 사람의 국어점수 입력
		//1번째 사람의 영어점수 입력
		//1번째 사람의 수학점수 입력
		//....
		//3번째사람의 수학점수 입력
		
		//이름 국어  영어 수학 총점  평균
		//aaa 88   99  87  ?    ?
		//.....
		Scanner sc = new Scanner(System.in);
		
		System.out.println("테스트에 참여할 인원수를 입력하세요");
		int people = sc.nextInt();
		String[] names= new String[people];
		int[] korNums = new int[people];
		int[] engNums = new int[people];
		int[] matNums = new int[people];
		for (int i = 0; i < people; i++) {
			System.out.println((i+1)+"번째 사람의 이름 입력");
			names[i] = sc.next(); ;
			System.out.println((i+1)+"번째 사람의 국어점수 입력");
			korNums[i] =sc.nextInt();
			System.out.println((i+1)+"번째 사람의 영어점수 입력");
			engNums[i] =sc.nextInt();
			System.out.println((i+1)+"번째 사람의 수학점수 입력");
			matNums[i] =sc.nextInt();
		}
		System.out.println("이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		DecimalFormat df= new DecimalFormat("#.##"); //소수점 자리 표현 
		for (int i = 0; i < people; i++) {
			int total = korNums[i] +engNums[i] +matNums[i];
			float average = (float)total/3;
			System.out.println(names[i]+"\t"+ korNums[i] +"\t"+engNums[i] +"\t"+matNums[i]+"\t"+total+"\t"+df.format(average));
		}
		
	}
}
