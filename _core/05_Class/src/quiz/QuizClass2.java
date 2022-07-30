package quiz;

import java.util.Scanner;

public class QuizClass2 {

	public static void main(String[] args) {
		// 메서드를 이용하여 별찍기
		//별의 겟수
		//출력 예
		//4
		//*
		//**
		//***
		//****
		
		Scanner sc = new Scanner(System.in);
		System.out.println("별의 갯수 입력 >");
		int stars = sc.nextInt();
		
		makeStar(stars);
	}

	private static void makeStar(int stars) {
		
		for (int i = 0; i < stars; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
