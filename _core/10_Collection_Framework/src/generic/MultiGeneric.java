package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Product{
	private String pino;
	private String price;
	public String getPino() {
		return pino;
	}
	public void setPino(String pino) {
		this.pino = pino;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}

class User{
	private String name;
	private List<Product> plist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	
}
public class MultiGeneric {

	public static void main(String[] args) {
		// 쇼핑몰의 유저리스느
		List<User> userList = new ArrayList<>();
		//0번 유저의 상품 구매 목록은 ?
		List<Product> prodListOfZero = userList.get(0).getPlist();
		//오늘 상품 구매한 유저들의 구매상품 리스트는
		List<List<Product>> todayList = new ArrayList<>();
		//권장하지는 않지만 임의로 만들어보는 3중 제네릭
		List<Map<String,List<Product>>> whatList = new ArrayList<>();
	}

}
