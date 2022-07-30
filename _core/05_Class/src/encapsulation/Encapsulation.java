package encapsulation;
//캡슐화
public class Encapsulation {

	public static void main(String[] args) {
		ColdPatient sufferer= new ColdPatient();//환자
		Contac600 contac600 = new Contac600();
		sufferer.take(contac600); //환자갸 약을 먹음

	}

}
