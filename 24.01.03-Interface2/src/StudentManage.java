// 학생 목록 관리
public interface StudentManage {
	void delete(Student student);
	// 명단 등록
	boolean register(Student s);
	// 명단 접근
	Student[] getStudents();
	// 학생 찾기
	Student findOne(String name);
	// 학생 접근
	Student getOne(int index);
}
