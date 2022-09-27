package hotel.working;

import java.util.List;

import hotel.domain.RoomVO;
import hotel.repository.DAO;
import hotel.repository.HotelDAO;

public class HotelWorking implements WorKing {
	private DAO dao;

public HotelWorking() {
	dao = new HotelDAO();
}

@Override
public void roomSeting(RoomVO[][] room) {
	dao.create(room);
	
}

@Override
public int checkIn(RoomVO room) {
	
	return dao.insert(room);
}

@Override
public List<RoomVO> RoomsStatus() {
	
	return dao.select();
}

@Override
public RoomVO roomDetail(String rno) {
	
	return dao.selsectOne(rno);
}

@Override
public int checkOut(String rno) {
	
	return dao.delete(rno);
}

@Override
public RoomVO gusetDetail(String name) {
	
	return dao.selectGuset(name);
}
}
