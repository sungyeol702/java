package quiz;

import java.text.DecimalFormat;


public class QuizClass3 {
	double base = 5.0;
	double height = 3.5;
	
	double getArea() {
		
		return (base* height) /2;
	}
	double getHypotenuse() {
		
		return  Math.sqrt(base*base+height*height); 
	}
	double getPerimeter() {
		return base + height + getHypotenuse();
	}

	public static void main(String[] args) {
//		a. 클래스명 : Ex03
//		-필드명 : base : double (초기값:5.0)
//		height : double (초기값:3.5)
//		-메서드명: getArea() : double
//		getHypotenuse() : double 
//		getPerimeter() : double
//		-공 식 : 삼각형의 넓이 = (밑변 * 높이) /2
//		-빗변길이 = Math.sqrt(밑변*밑변+높이*높이)
//		-둘레길이 = 밑변 + 높이 + 빗변길이
//		-Ex03로 객체 ob를 생성
//		-getArea()는 삼각형의 넓이를 리턴
//		-getHypotenuse() 빗변의 길이를 리턴
//		-getPerimeter()는 둘레길이를 리턴
//		b. 출력 예)
//		삼각형의넓이 : 8.75
//		빗변길이 : 6.10
//		둘레길이 : 14.6
		
		QuizClass3 ob = new QuizClass3();
		double area = ob.getArea();
		double hypotenuse = ob.getHypotenuse();
		double perimeter = ob.getPerimeter();
		DecimalFormat df= new DecimalFormat("#.##");
		System.out.println("삼각형 넓이:"+area);
		System.out.println("빗변길이:"+df.format(hypotenuse));
		System.out.printf("둘레길이:%.2f\n",ob.getPerimeter());

	}

}
