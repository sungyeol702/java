package hotel.repository;

import java.util.List;

import hotel.domain.RoomVO;

public interface DAO {

	void create(RoomVO[][] room);

	int insert(RoomVO room);

	List<RoomVO> select();

	RoomVO selsectOne(String rno);

	int delete(String rno);

	RoomVO selectGuset(String name);

}
