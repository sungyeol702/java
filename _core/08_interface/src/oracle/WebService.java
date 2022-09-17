package oracle;

public class WebService {
	Oracle orcle ;
	public WebService() {
		orcle = new Oracle();
	}
	public void register(Member regInfo) {
		
		orcle.insert(regInfo);
		
	}
}
