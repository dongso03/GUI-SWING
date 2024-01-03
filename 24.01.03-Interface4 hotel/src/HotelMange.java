
public interface HotelMange {
	void register(Customer cus);
	// 명단 접근
	Customer[] getStudents();
	//  찾기
	Customer findOne(String name);
	//  접근
	Customer getOne(int index);
	
	//예약
   

}
