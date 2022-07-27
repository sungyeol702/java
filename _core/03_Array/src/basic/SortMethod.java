package basic;

import java.util.Arrays;
import java.util.Collections;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;

public class SortMethod {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[12];
		//int[] intArr = new int[12];
		for(int i =0; i <intArr.length; i++) {
			intArr[i] =new Integer((int)(Math.floor(Math.random()*100)+1));
			//intArr[i] =(int)(Math.floor(Math.random()*100)+1);
		}
		//순자정렬
		//기존의 배열 자체를 바꾼다
		Arrays.sort(intArr);
		for (int i : intArr) {// 어드벤스드 포문
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----역정열----");
		//역정렬
		// 배열의 요소 데이터 타입이 object 
		Arrays.sort(intArr, Collections.reverseOrder());
		for (int i : intArr) {// 어드벤스드 포문
			System.out.print(i+" ");
		}
	}

}
