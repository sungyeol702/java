package quiz;

class Student {
	String name;
	int classNum;
	int num;
	int kor;
	int eng;
	int mat;
	int total;

	int getTotal() {
		total=kor + eng + mat;
		return kor + eng + mat;
	}

	double getAvg() {
		return (double)total/3;
	}
}

public class QuizClass4 {

	public static void main(String[] args) {
//		a. Student 클래스 생성
//		b. 학생 이름,반,번호,국어점수,영어점수,수학점수 변수 생성
//		c. getTotal메서드(점수총점)반환
//		d. getAvg메서드(평점)반환

	}

}
