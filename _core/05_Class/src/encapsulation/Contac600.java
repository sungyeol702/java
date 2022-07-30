package encapsulation;

public class Contac600 {
	private SnivelCapsule sni;
	private SneezeCapsule snz;
	private SnuffleCapsule snf;
	public Contac600() {
		sni = new SnivelCapsule();
		snz = new SneezeCapsule();
		snf = new SnuffleCapsule();
	}
	public void take() {
		// Contac600의 기능
		sni.take();
		snz.take();
		snf.take();

	}

}
