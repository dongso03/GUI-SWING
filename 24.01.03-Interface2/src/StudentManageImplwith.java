import java.util.Arrays;

public class StudentManageImplwith extends StudentManageImpl {

	@Override
	public boolean register(Student s) {
		if(findEmpty()== -1) {
		students = Arrays.copyOf(students, students.length +10);
		}
		
		return super.register(s);
	}
}
