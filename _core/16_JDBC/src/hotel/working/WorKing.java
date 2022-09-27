package hotel.working;

import java.util.List;

import hotel.domain.RoomVO;

public interface WorKing {

	void roomSeting(RoomVO[][] room);

	int checkIn(RoomVO roomVO);

	List<RoomVO> RoomsStatus();

	RoomVO roomDetail(String rno);

	int checkOut(String rno);

	RoomVO gusetDetail(String name);
	
}
