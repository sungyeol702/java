package abstracts;

public abstract class Cooler extends Electronics {

	@Override
	public boolean isPower() {
		// TODO Auto-generated method stub
		return super.isPower();
	}

	@Override
	public void setPower(boolean power) {
		// TODO Auto-generated method stub
		super.setPower(power);
	}

	@Override
	public int getButton() {
		// TODO Auto-generated method stub
		return super.getButton();
	}

	@Override
	public void setButton(int button) {
		System.out.println("냉장 버튼 추가");
		super.setButton(button);
	}

	@Override
	public String getFeature() {
		// TODO Auto-generated method stub
		return super.getFeature();
	}

	@Override
	public void setFeature(String feature) {
		System.out.println("냉장 과학 ㅊㅊ ㅜ가");
		super.setFeature(feature);
	}

}
