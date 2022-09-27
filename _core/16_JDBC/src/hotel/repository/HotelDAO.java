package hotel.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import address.DatabaseConnector;
import hotel.domain.RoomVO;

public class HotelDAO implements DAO {
	private Connection conn;
	private PreparedStatement pst;
	private String query;

	public HotelDAO() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public void create(RoomVO[][] room) {
		query = "insert into room(rno,guest_tel) values (?,?)";

		try {
			for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[i].length; j++) {
					pst = conn.prepareStatement(query);
					pst.setString(1, room[i][j].getRno());
					pst.setString(2, room[i][j].getGuset_tel());
					pst.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(RoomVO room) {
		if (isEmpty(room.getRno())) {
			query = "update room set guest_name = ?," 
					+ "guest_tel= ?," 
					+ "guest_age = ?,"
					+ "guest_gen = ?,"
					+ "is_empty = ?,"
					+ "check_in_time = now() " 
					+ "where rno = ?";
			try {
				pst = conn.prepareStatement(query);
				pst.setString(1, room.getGuset_name());
				pst.setString(2, room.getGuset_tel());
				pst.setInt(3, room.getGuset_age());
				pst.setInt(4, room.getGuset_gen());
				pst.setInt(5, room.getIs_empty());
				pst.setString(6, room.getRno());

				return pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	private boolean isEmpty(String rno) {
		query = "select * from room where rno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, rno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				if (rs.getInt("is_empty") < 1) {
					return true;
				} else {
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<RoomVO> select() {
		query= "select * from room";
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs =pst.executeQuery();
			List<RoomVO> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new RoomVO(rs.getString("rno"),
									rs.getInt("is_empty")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public RoomVO selsectOne(String rno) {
		query = "select * from room where rno = ?";
		try {
			pst=conn.prepareStatement(query);
			pst.setString(1, rno);
			ResultSet rs= pst.executeQuery();
			while (rs.next()) {
				return new RoomVO(rs.getString("rno"),
								  rs.getString("guest_name"),
								  rs.getString("guest_tel"),
								  rs.getInt("guest_age"),
								  rs.getInt("guest_gen"),
								  rs.getInt("is_empty"),
								  rs.getString("check_in_time"),
								  rs.getString("check_out_time"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(String rno) {
		if(!isEmpty(rno)) {
			query = "update room set guest_name = NULL," 
					+ "guest_tel= 0," 
					+ "guest_age = NULL,"
					+ "guest_gen = NULL,"
					+ "is_empty = 0,"
					+ "check_in_time = NULL, " 
					+ "check_out_time = now() " 
					+ "where rno = ?";
		try {
			pst= conn.prepareStatement(query);
			pst.setString(1, rno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		return 0;
	}

	@Override
	public RoomVO selectGuset(String name) {
		query = "select * from room where guest_name = ?";
		try {
			pst =conn.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				return new RoomVO(rs.getString("rno"),
								  rs.getString("guest_name"),
								  rs.getString("guest_tel"),
								  rs.getInt("guest_age"),
								  rs.getInt("guest_gen"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return null;
	}

}
