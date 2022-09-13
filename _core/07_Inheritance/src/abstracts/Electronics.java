package abstracts;
public abstract class Electronics {//전자제품 개념의 클래스
	protected boolean power;
	protected int button;
	protected String feature;
	
	public Electronics() {}

//추상메서드를 갖고있으면 추상클래스가 된다 반드시 추상클래스로 선언 abstract
	//상속관계 직접내려받는거면 부모클래스는 추상클래스로 만드는 것도 나쁘지 않다
	//개념적으로 확실하게 잡고 시작해야함
	abstract void buttonColor(String color);// 추상적 개념만선언 개념화
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getButton() {
		return button;
	}

	public void setButton(int button) {
		this.button = button;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

}
