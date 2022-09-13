package practice;

public class CharDB {
	private Character[] chardb = new Character[4];
	private Character db;

	public Character[] getChardb() {
		return chardb;
	}

	public void setChardb(Character[] chardb) {
		this.chardb = chardb;
	}

	public Character getDb(Character gameDb, int chNum) {

		if(chardb[chNum-1] == null) {
			return gameDb;
		}else {
			System.out.println("기존 DB");
		return chardb[chNum-1];
		}
	}

	public void setDb(Character gameDb, int chNum) {
		
		chardb[chNum-1]=gameDb;
		System.out.println(chardb[chNum-1].getName()+" 데이터 저장");
			
	}

}
