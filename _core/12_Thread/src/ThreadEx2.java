
public class ThreadEx2 {
	static long startTime = 0L;
	public static void main(String[] args) {
		ThreaderA tha = new ThreaderA();
		ThreaderB thb = new ThreaderB();
		
		tha.start();
		thb.start();
		startTime= System.currentTimeMillis() ;
		try {
			tha.join();//싱크를 정확하게 맞추려면 싱크로나이즈드라는 키워드를 사용
			thb.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis()-ThreadEx2.startTime);
	}

}
