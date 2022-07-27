package basic;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		int s =0;
		// intArr에 랜덤 정수를 넣고 순차정렬과 역정렬을 구현해 보세요
		System.out.print("[");
				while (s<intArr.length) {
					intArr[s]= (int)Math.floor(Math.random()*100);
					System.out.print(intArr[s]+" ");
					s++;
				}
				System.out.print("]");
				//정렬
				//버블 정렬
				System.out.println();
				for(int i =0; i<intArr.length-1; i++) {
					for(int j = i+1; j < intArr.length; j++) {
						if(intArr[i] > intArr[j]) {
							int empty =intArr[j] ;
							intArr[j] = intArr[i];
							intArr[i] = empty;
						}
					}
				}
				for(int i =0; i <intArr.length; i++) {
					System.out.print(intArr[i]+" ");
				}
				
				//역정렬
				System.out.println();
				for(int i =0; i<intArr.length-1; i++) {
					for(int j = i+1; j < intArr.length; j++) {
						if(intArr[i] < intArr[j]) {
							int empty =intArr[j] ;
							intArr[j] = intArr[i];
							intArr[i] = empty;
						}
					}
				}
				for(int i =0; i <intArr.length; i++) {
					System.out.print(intArr[i]+" ");
				}

				

	}

}
