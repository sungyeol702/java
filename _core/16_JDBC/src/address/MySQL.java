package address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQL implements DataBase {
	private Connection conn;
	private PreparedStatement pst;
	private String query = "";

	public MySQL() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public boolean insert(Address info) {
		query = "insert into address values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);// 데이터소스에서 . 프리페어스테이트먼트에 쿼리를 던져서 상태정보값을 가지고온다
			pst.setString(1, info.getName());// 1은 물음표의 첫번째 자리
			pst.setString(2, info.getTel());
			pst.setInt(3, info.getAge());// 실행할 쿼리를 완성, 프리페어스테이먼트 상태규격을 통해서
			return pst.executeUpdate() > 0 ? true : false;// 업데이트 성공하면 1을 준다 //db에 상황이바뀌는건 executeUpdate 를 쓴다
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Address> selectList() {
		query =  "select * from address";
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();// executeQuery()리턴값 ResultSet
			List<Address> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age")));

			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Address selectOne(String name) {
		query ="select * from address where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Address(rs.getString("name"),rs.getString("tel"),rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Address info) {
		
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, info.getTel());
			pst.setInt(2, info.getAge());
			pst.setString(3, info.getName());
			return pst.executeUpdate() >0? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String name) {
		query = "delete from address where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			return pst.executeUpdate()>0? true: false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
