
public class HotelMangeImpl implements HotelMange {
	protected Customer[] cus;
	private final int MAX_LENGTH = 80;

	public HotelMangeImpl() {
		cus = new Customer[MAX_LENGTH];
	}

	@Override
	public void register(Customer c) {
		int currentpos = 0;
		cus[currentpos] = c;
		currentpos++;
		
	}

	@Override
	public Customer[] getStudents() {
		return cus;
	}

	@Override
	public Customer findOne(String name) {
		for(Customer c :cus) {
			if(c != null && c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Customer getOne(int index) {
		if (index < 0 || index > cus.length) {
		return null;
		}
		return cus[index];
	}

}
