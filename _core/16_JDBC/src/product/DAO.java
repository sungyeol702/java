package product;

import java.util.List;

public interface DAO {

	int insert(ProductVO pvo);//DAO : data Access Object

	List<ProductVO> selectList();

	ProductVO selectOne(int pno);

	int update(ProductVO pvo);


	int delet(int pno);

}
